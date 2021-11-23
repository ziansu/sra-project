public void interactionEnded() throws java.io.IOException {
    socket.close();
    socket = null;
    com.android.gscaparrotti.bendermobile.ServerInteractor.instance = null;
}