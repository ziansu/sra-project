@java.lang.Override
public void onFailure(final org.jboss.gwt.flow.FunctionContext context) {
    org.jboss.hal.client.bootstrap.LoadingPanel.get().off();
    org.jboss.hal.client.bootstrap.HalBootstrapper.logger.error("Bootstrap error: {}", context.getErrorMessage());
    elemental.client.Browser.getDocument().getBody().appendChild(org.jboss.hal.client.bootstrap.BootstrapFailed.create(context.getErrorMessage(), resources.constants()).asElement());
}