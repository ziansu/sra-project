@java.lang.Override
public void handleMessage(com.ubirouting.instantmsg.msgservice.Message msg) {
    switch (msg.what) {
        case com.ubirouting.instantmsg.msgservice.MsgService.MSG_SEND_MESSAGE :
            int findableId = msg.arg1;
            msgDispatcher.register(msg.replyTo, findableId);
            addToSendPendingQueue(getInstantMessage(msg, com.ubirouting.instantmsg.basic.Injection.provideSerializer()));
            break;
        default :
            super.handleMessage(msg);
    }
}