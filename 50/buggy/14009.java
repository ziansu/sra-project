@java.lang.Override
protected void configureServlets() {
    super.configureServlets();
    filter(edu.emory.cci.aiw.cvrg.eureka.common.config.AbstractJerseyServletModuleWithPersist.CONTAINER_PATH).through(com.google.inject.persist.PersistFilter.class);
}