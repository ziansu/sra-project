private void closeOnError() {
    try {
        socket.close();
    } catch (final java.io.IOException e) {
        e.printStackTrace();
        mainController.showMessageOnMainView(((("Errore nella chiusura della socket" + (socket)) + (e.getMessage())) + (e.toString())));
    } finally {
        sockets.remove(socket);
    }
}