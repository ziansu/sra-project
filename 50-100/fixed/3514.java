public void receive(ch.tiim.telegram.TGMessage msg) {
    if ((msg.getText()) != null) {
        java.lang.String[] args = msg.getText().split(" ");
        ch.tiim.utils.StringArrays.trimArray(args);
        try {
            registry.handle(args, msg, bot);
        } catch (java.io.IOException e) {
            ch.tiim.MessageProcessor.LOGGER.warning(e);
        }
    }
}