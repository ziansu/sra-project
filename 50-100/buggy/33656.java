public void sendMsg(android.os.Message msg) {
    if (bound) {
        try {
            remoteClient.send(msg);
        } catch (java.lang.Exception e) {
            com.yy.httpproxy.util.Log.e(com.yy.httpproxy.service.ConnectionService.TAG, "sendMsg error!", e);
        }
    }else {
        com.yy.httpproxy.util.Log.d(com.yy.httpproxy.service.ConnectionService.TAG, "sendMsg not bound");
    }
}