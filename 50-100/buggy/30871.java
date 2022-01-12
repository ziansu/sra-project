@java.lang.Override
protected javax.ws.rs.core.Application configure() {
    com.github.jlgrock.snp.web.controllers.GenericControllerTest.LOGGER.debug("Registering web application configurations...");
    enable(TestProperties.LOG_TRAFFIC);
    enable(TestProperties.DUMP_ENTITY);
    org.glassfish.hk2.api.ServiceLocator serviceLocator = org.glassfish.hk2.utilities.ServiceLocatorUtilities.createAndPopulateServiceLocator();
    org.glassfish.jersey.server.ResourceConfig application = com.github.jlgrock.snp.web.configuration.ApplicationConfig.createApp(serviceLocator);
    registerInjectionPoints(application);
    return application;
}