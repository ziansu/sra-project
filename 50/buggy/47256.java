@java.lang.Override
protected org.springframework.web.context.WebApplicationContext createServletApplicationContext() {
    org.springframework.web.context.support.AnnotationConfigWebApplicationContext context = new org.springframework.web.context.support.AnnotationConfigWebApplicationContext();
    context.register(eu.europeana.api2.config.SwaggerConfig.class, eu.europeana.api2.config.WebMvcConfig.class);
    context.addApplicationListener(new eu.europeana.corelib.web.context.VcapPropertyLoaderListener());
    return context;
}