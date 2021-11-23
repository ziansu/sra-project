@java.lang.Override
public void onReceive(android.content.Context arg0, android.content.Intent arg1) {
    int messageID = arg1.getIntExtra(com.wwwsmschat.smschat.manager.SendSMSManager.ARG_MESSAGE_ID, (-1));
    switch (getResultCode()) {
        case android.app.Activity.RESULT_OK :
            android.widget.Toast.makeText(mActivity, "SMS delivered", Toast.LENGTH_SHORT).show();
            notifySMSStatusChange(messageID, com.wwwsmschat.smschat.manager.SendSMSManager.STATUS_INT_DELIVERED);
            break;
        case android.app.Activity.RESULT_CANCELED :
            android.widget.Toast.makeText(mActivity, "Failed to send SMS", Toast.LENGTH_SHORT).show();
            notifySMSStatusChange(messageID, com.wwwsmschat.smschat.manager.SendSMSManager.STATUS_INT_FAILED);
            break;
    }
    arg0.unregisterReceiver(this);
}