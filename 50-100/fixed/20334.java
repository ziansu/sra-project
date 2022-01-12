@java.lang.Override
protected void configure() {
    install(new org.seedstack.w20.internal.W20Module(w20Fragments, fragmentConfigurationHandlerClasses, configuredApplication));
    if ((servletContext) != null) {
        install(new com.google.inject.servlet.ServletModule() {
            @java.lang.Override
            protected void configureServlets() {
                bind(org.seedstack.w20.internal.MasterPageBuilder.class);
                if ((masterPageEnabled) && (masterPageAsServlet)) {
                    bind(org.seedstack.w20.internal.MasterpageServlet.class).in(Scopes.SINGLETON);
                    serve("/").with(org.seedstack.w20.internal.MasterpageServlet.class);
                }
            }
        });
    }
}