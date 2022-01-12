protected void configureServlets() {
    bind(io.swagger.sample.resource.RootResource.class).asEagerSingleton();
    bind(io.swagger.sample.resource.SampleExceptionMapper.class).asEagerSingleton();
    bind(com.netflix.karyon.swagger.SwaggerConfiguration.class).toInstance(new com.netflix.karyon.swagger.SwaggerConfiguration(getServletContext()));
    bind(com.sun.jersey.guice.spi.container.servlet.GuiceContainer.class).asEagerSingleton();
    filter("/*").through(io.swagger.sample.util.ApiOriginCorsFilter.class);
    filter("/*").through(com.sun.jersey.guice.spi.container.servlet.GuiceContainer.class, createServletParams());
}