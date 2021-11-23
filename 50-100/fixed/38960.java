@javax.annotation.PreDestroy
public void destroy() {
    com.github.mshin.sosa.CachingOsgiServiceGetter.LOGGER.info("destroying {}...", this.getClass().getName());
    this.cache.clearInstanceMap();
    for (org.osgi.framework.ServiceReference<?> reference : this.cache.serviceReferenceMapValues()) {
        context.ungetService(reference);
    }
    com.github.mshin.sosa.CachingOsgiServiceGetter.LOGGER.info("Finished destroying {}.", this.getClass().getName());
}