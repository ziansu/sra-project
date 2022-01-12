public void connectServer() {
    mServerConnector = cn.iotguard.common.socket.ServerConnector.getInstance(this);
    mServerConnector.connect(cn.iotguard.sce.app.AndroidApplication.HOST_NAME, cn.iotguard.sce.app.AndroidApplication.HOST_PORT);
}