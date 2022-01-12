public void call(java.lang.String command, java.util.HashMap<java.lang.String, java.lang.String> params) {
    org.x3f.autobot.AutobotApplication app = ((org.x3f.autobot.AutobotApplication) (getApplication()));
    if ((app.getProtocol()) == (AutobotApplication.PROTOCOL_BT)) {
        if (app.isBTConnected()) {
            app.call(command, params);
        }else {
        }
    }else {
        app.call(command, params, this.getHttpCallback());
    }
}