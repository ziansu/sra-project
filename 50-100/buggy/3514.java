public void receive(ch.tiim.telegram.TGMessage msg) {
    java.lang.String[] args = msg.getText().split(" ");
    ch.tiim.utils.StringArrays.trimArray(args);
    try {
        registry.handle(args, msg, bot);
    } catch (java.io.IOException e) {
        ch.tiim.MessageProcessor.LOGGER.warning(e);
    }
}