@java.lang.Override
public void afterContextLoaded() throws java.lang.Exception {
    sessionManager = new com.aspectran.core.component.session.DefaultSessionManager(getActivityContext());
    sessionManager.setGroupName("CON");
    com.aspectran.core.context.builder.config.AspectranSessionConfig sessionConfig = getAspectranConfig().getParameters(AspectranConfig.session);
    if (sessionConfig != null) {
        sessionManager.setSessionConfig(sessionConfig);
    }
    sessionManager.initialize();
}