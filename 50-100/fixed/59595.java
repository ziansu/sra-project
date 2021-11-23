@java.lang.Override
public boolean handleMessage(final android.os.Message msg) {
    switch (msg.what) {
        case jarp.mx.com.basichandler.MainActivity.OperationInBackGround :
            jarp.mx.com.basichandler.MessageText messageText = ((jarp.mx.com.basichandler.MessageText) (msg.obj));
            android.os.Handler mainUi = messageText.handler;
            mainUi.obtainMessage(jarp.mx.com.basichandler.MainActivity.OperationInMainThread, messageText.message).sendToTarget();
            break;
        case jarp.mx.com.basichandler.MainActivity.OperationInMainThread :
            final java.lang.String message = ((java.lang.String) (msg.obj));
            textView.setText(message);
            break;
        default :
    }
    return true;
}