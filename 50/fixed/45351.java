@java.lang.Override
public void processRender(org.exoplatform.webui.application.WebuiApplication app, org.exoplatform.webui.application.WebuiRequestContext context) throws java.lang.Exception {
    this.currentUser = context.getRemoteUser();
    super.processRender(app, context);
}