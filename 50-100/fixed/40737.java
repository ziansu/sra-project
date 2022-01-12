public void onStartup(javax.servlet.ServletContext container) throws javax.servlet.ServletException {
    org.springframework.web.context.support.AnnotationConfigWebApplicationContext ctx = new org.springframework.web.context.support.AnnotationConfigWebApplicationContext();
    ctx.register(my.inpensa.configuration.AppConfig.class);
    ctx.setServletContext(container);
    javax.servlet.ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new org.springframework.web.servlet.DispatcherServlet(ctx));
    servlet.setLoadOnStartup(1);
    servlet.addMapping("/");
}