@java.lang.Override
public void addMsg(client.intf.IMsgWindow imw, java.lang.Object msg) throws java.lang.ClassCastException {
    java.lang.String jsonString = ((java.lang.String) (msg));
    java.lang.String sender = client.ctl.JsonAnalizerClient.getUser(jsonString);
    java.lang.String content = client.ctl.JsonAnalizerClient.getMessageContent(jsonString);
    imw.appendMsgRecord((sender + " :"));
    imw.appendMsgRecord(content);
}