@java.lang.Override
public void setup(com.datatorrent.api.Context.OperatorContext context) {
    super.setup(context);
    uriHelper(context);
    com.datatorrent.lib.io.PubSubWebSocketAppDataResult.logger.debug("Setting up:\nuri:{}\ntopic:{}", this.getUri(), this.getTopic());
}