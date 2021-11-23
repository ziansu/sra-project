@java.lang.Override
public void afterContextLoaded() throws java.lang.Exception {
    sessionManager = new com.aspectran.core.component.session.DefaultSessionManager(getActivityContext());
    sessionManager.setGroupName("CON");
    com.aspectran.core.context.builder.config.AspectranContextConfig contextConfig = getAspectranConfig().touchAspectranContextConfig();
    com.aspectran.core.context.builder.config.AspectranSessionConfig sessionConfig = contextConfig.getParameters(AspectranConfig.session);
    sessionManager.setSessionConfig(sessionConfig);
    sessionManager.initialize();
}