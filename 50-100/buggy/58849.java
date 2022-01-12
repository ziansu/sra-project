private void processNodeDepthUpdate(application.Message msg, application.Connection conn) {
    java.lang.Integer newNodeDepth = (java.lang.Integer.parseInt(msg.getMsgText())) + 1;
    setNodeDepth(newNodeDepth);
    application.ChatController.getInstance().receiveDebugMessage(("after connection, set nodeDepth to " + newNodeDepth));
    msg.setMsgText(newNodeDepth.toString());
    forwardMessage(msg, conn);
}