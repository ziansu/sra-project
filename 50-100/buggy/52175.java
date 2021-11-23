@java.lang.Override
protected void CmdProc(org.json.JSONObject recvdReq) {
    java.lang.System.out.println("[1111 Receive Request signout] =====>");
    java.lang.System.out.println("[2222 Request process > Make Request] =====>");
    try {
        io.dase.network.DamqSndProducer sndProducer = io.dase.network.DamqSndProducer.getInstance();
        java.lang.System.out.println("[3333 Send Request signout] ----->");
        sndProducer.PushToSendQueue("common", recvdReq.getString("msgid"), MsgType.Request, recvdReq.getString("workcode"), recvdReq.getString("body"));
        java.lang.System.out.println("[4444 Wait Response...] ----->");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}