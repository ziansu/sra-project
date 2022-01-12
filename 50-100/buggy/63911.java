@javax.annotation.PreDestroy
public void destroy() {
    if (com.github.mshin.sosa.OsgiServiceRegistrator.LOGGER.isDebugEnabled()) {
        com.github.mshin.sosa.OsgiServiceRegistrator.LOGGER.debug("destroying {}...", this.getClass().getName());
    }
    for (org.osgi.framework.ServiceRegistration<?> registration : this.registrationList) {
        registration.unregister();
    }
    this.registrationList.clear();
    if (com.github.mshin.sosa.OsgiServiceRegistrator.LOGGER.isDebugEnabled()) {
        com.github.mshin.sosa.OsgiServiceRegistrator.LOGGER.debug("Finished destroying {}.", this.getClass().getName());
    }
}