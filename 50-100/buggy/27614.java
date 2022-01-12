void replySucceeded(android.os.Message msg, java.lang.Object obj) {
    if ((msg.replyTo) != null) {
        android.os.Message reply = android.os.Message.obtain();
        reply.what = android.net.wifi.WifiScanner.CMD_OP_SUCCEEDED;
        reply.arg2 = msg.arg2;
        reply.obj = obj;
        try {
            msg.replyTo.send(reply);
        } catch (android.os.RemoteException e) {
        }
    }else {
    }
}