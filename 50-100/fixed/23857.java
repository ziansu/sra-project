@java.lang.Override
public void shutdown(java.lang.String username) throws java.io.IOException {
    java.lang.String sendMsg;
    sendMsg = (((com.ronger.service.util.MsgConfig.SHUTDOWN) + (com.ronger.service.util.MsgConfig.SPACE)) + username) + (com.ronger.service.util.MsgConfig.ENTER);
    sendMsg(sendMsg);
    java.lang.String receiveMsg = receiveMsg();
    com.ronger.service.util.MsgUtil.showMsg(receiveMsg);
}