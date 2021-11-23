@java.lang.Override
public void handleMessage(com.ubirouting.instantmsg.msgservice.Message msg) {
    switch (msg.what) {
        case com.ubirouting.instantmsg.msgservice.MsgService.MSG_SEND_MESSAGE :
            if (((msg.obj) != null) && ((msg.obj) instanceof com.ubirouting.instantmsg.msgservice.Transaction)) {
                int findableId = msg.arg1;
                msgDispatcher.register(msg.replyTo, findableId);
                addToSendPendingQueue(com.ubirouting.instantmsg.msgservice.Transaction.getInstantMessage(msg));
            }else
                android.util.Log.e(com.ubirouting.instantmsg.msgservice.MsgService.TAG, "msg contains no InstantMessage");
            
        default :
            super.handleMessage(msg);
    }
}