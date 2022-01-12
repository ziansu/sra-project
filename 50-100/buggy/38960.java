@javax.annotation.PreDestroy
public void destroy() {
    if (com.github.mshin.sosa.CachingOsgiServiceGetter.LOGGER.isDebugEnabled()) {
        com.github.mshin.sosa.CachingOsgiServiceGetter.LOGGER.debug("destroying {}...", this.getClass().getName());
    }
    this.cache.clearInstanceMap();
    for (org.osgi.framework.ServiceReference<?> reference : this.cache.serviceReferenceMapValues()) {
        context.ungetService(reference);
    }
    if (com.github.mshin.sosa.CachingOsgiServiceGetter.LOGGER.isDebugEnabled()) {
        com.github.mshin.sosa.CachingOsgiServiceGetter.LOGGER.debug("Finished destroying {}.", this.getClass().getName());
    }
}