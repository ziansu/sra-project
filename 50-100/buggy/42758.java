public static void addTemplates(java.lang.String folder) {
    com.igumnov.common.WebServer.templateFolder = folder;
    org.thymeleaf.templateresolver.ServletContextTemplateResolver templateResolver = new org.thymeleaf.templateresolver.ServletContextTemplateResolver();
    templateResolver.setTemplateMode("LEGACYHTML5");
    templateResolver.setPrefix("/");
    templateResolver.setSuffix(".html");
    templateResolver.setCacheTTLMs(3600000L);
    com.igumnov.common.WebServer.templateEngine = new org.thymeleaf.TemplateEngine();
    com.igumnov.common.WebServer.templateEngine.addDialect(new nz.net.ultraq.thymeleaf.LayoutDialect());
    com.igumnov.common.WebServer.templateEngine.setTemplateResolver(templateResolver);
}