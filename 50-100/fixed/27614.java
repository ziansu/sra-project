void replySucceeded(android.os.Message msg) {
    if ((msg.replyTo) != null) {
        android.os.Message reply = android.os.Message.obtain();
        reply.what = android.net.wifi.WifiScanner.CMD_OP_SUCCEEDED;
        reply.arg2 = msg.arg2;
        try {
            msg.replyTo.send(reply);
        } catch (android.os.RemoteException e) {
        }
    }else {
    }
}