public static model.network.ServerSocketWorker setupSocketConnectionListener(int port, int listeningMode, model.listener.NetworkConnectionListener listener) {
    model.network.ServerSocketWorker serverSocketWorker = new model.network.ServerSocketWorker(port, listeningMode, new model.listener.SocketConnectionListener() {
        @java.lang.Override
        public void socketConnection(java.net.Socket socket) {
            model.network.InstantMessagingModule instantMessagingModule = new model.network.InstantMessagingModule(socket);
            listener.networkConnection(instantMessagingModule);
        }

        @java.lang.Override
        public void portSelected(java.lang.String port) {
        }
    });
    new java.lang.Thread(serverSocketWorker).start();
    return serverSocketWorker;
}