@javax.annotation.PreDestroy
public void destroy() {
    com.github.mshin.sosa.OsgiServiceRegistrator.LOGGER.info("destroying {}...", this.getClass().getName());
    for (org.osgi.framework.ServiceRegistration<?> registration : this.registrationList) {
        registration.unregister();
    }
    this.registrationList.clear();
    com.github.mshin.sosa.OsgiServiceRegistrator.LOGGER.info("Finished destroying {}.", this.getClass().getName());
}