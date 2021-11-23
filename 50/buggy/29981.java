public void interactionEnded() throws java.io.IOException {
    if ((socket) != null) {
        socket.close();
    }
    socket = null;
    com.android.gscaparrotti.bendermobile.network.ServerInteractor.instance = null;
}