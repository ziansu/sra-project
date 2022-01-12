@java.lang.Override
protected void CmdProc(org.json.JSONObject recvdReq) {
    java.lang.System.out.println("[1111 Receive Request signin] =====>");
    java.lang.System.out.println("[2222 Request process > Make Request] =====>");
    io.dase.network.DamqSndProducer sndProducer = io.dase.network.DamqSndProducer.getInstance();
    java.lang.System.out.println("[3333 Send Request signup] ----->");
    sndProducer.PushToSendQueue("common", recvdReq.getString("msgid"), MsgType.Request, recvdReq.getString("workcode"), recvdReq.getString("body"));
    java.lang.System.out.println("[4444 Wait Response...] ----->");
}