@org.springframework.context.annotation.Bean
public org.thymeleaf.spring4.SpringTemplateEngine templateEngine() {
    org.thymeleaf.spring4.SpringTemplateEngine engine = new org.thymeleaf.spring4.SpringTemplateEngine();
    engine.addTemplateModeHandler(StandardTemplateModeHandlers.HTML5);
    engine.addTemplateModeHandler(DandelionTemplateModeHandlers.DANDELION_JS);
    engine.addTemplateResolver(templateResolver());
    engine.addTemplateResolver(dandelionAssetTemplateResolver());
    engine.addDialect(new com.github.dandelion.thymeleaf.dialect.DandelionDialect());
    engine.addDialect(new com.github.dandelion.datatables.thymeleaf.dialect.DataTablesDialect());
    return engine;
}