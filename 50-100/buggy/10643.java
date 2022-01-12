@java.lang.Override
public void subscribe(final com.github.rxsockets.ObservableEmitter<io.socket.client.Socket> emitter) throws java.lang.Exception {
    if (!(connected.get())) {
        if (autoDisconnect) {
            emitter.setDisposable(new com.github.rxsockets.SocketConnectionDisposable(socket, connected));
        }
        socket.connect();
        connected.set(true);
    }else {
        emitter.onNext(socket);
    }
}