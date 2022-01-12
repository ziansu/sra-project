@java.lang.Override
public void handleMessage(com.ubirouting.instantmsg.msgservice.Message msg) {
    switch (msg.what) {
        case com.ubirouting.instantmsg.msgservice.MsgService.MSG_SEND_MESSAGE :
            int findableId = msg.arg1;
            msgDispatcher.register(msg.replyTo, findableId);
            addToSendPendingQueue(com.ubirouting.instantmsg.msgservice.Transaction.getInstantMessage(msg));
        default :
            super.handleMessage(msg);
    }
}