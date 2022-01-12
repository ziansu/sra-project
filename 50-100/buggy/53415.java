public void disconnect() {
    mConnected = false;
    if ((mEdpSocket) != null) {
        try {
            mEdpSocket.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            mEdpSocket = null;
        }
    }
    com.chinamobile.iot.onenet.edp.toolbox.EdpService.stop(mApplicationContext);
    com.chinamobile.iot.onenet.edp.toolbox.EdpClient.Message msg = new com.chinamobile.iot.onenet.edp.toolbox.EdpClient.Message();
    msg.setType(com.chinamobile.iot.onenet.edp.toolbox.EdpClient.Message.DISCONNECT);
    enqueueMsg(msg);
    mMessageQueue.clear();
    com.chinamobile.iot.onenet.edp.toolbox.EdpClient.sInstance = null;
}