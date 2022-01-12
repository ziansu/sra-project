public void send(org.catchyou.api.models.ChatData data) {
    try {
        timeout = defaultTimeout;
        this.websocket.sendMessage(org.json.serialization.JSONConvert.serialize(data).toString());
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex.toString());
    }
}