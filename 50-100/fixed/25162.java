@java.lang.Override
protected void ResponseProc(java.lang.String RespStr) {
    java.lang.System.out.println(("[6666 ResponseProc] str : " + RespStr));
    org.json.JSONObject jo = new org.json.JSONObject(RespStr);
    try {
        io.dase.network.DamqSndProducer sndProducer = io.dase.network.DamqSndProducer.getInstance();
        java.lang.System.out.println("[7777 Send Response signout] ----->");
        sndProducer.PushToSendQueue("app", jo.getString("msgid"), MsgType.Response, jo.getString("workcode"), jo.get("body").toString());
        java.lang.System.out.println("[8888 Process Done]");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}