@java.lang.Override
public void config(com.blade.config.Configuration configuration) {
    java.lang.System.out.println("1 ...");
    com.blade.mvc.view.template.JetbrickTemplateEngine templateEngine = new com.blade.mvc.view.template.JetbrickTemplateEngine();
    jetbrick.template.resolver.GlobalResolver resolver = templateEngine.getJetEngine().getGlobalResolver();
    resolver.registerFunctions(com.grice.ext.Funcs.class);
    Constant.VIEW_CONTEXT = templateEngine.getJetEngine().getGlobalContext();
    com.blade.mvc.view.ViewSettings.$().templateEngine(templateEngine);
}