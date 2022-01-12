@java.lang.Override
public boolean isConnected() {
    return ((myConnected) && ((mySocket) != null)) && (!(mySocket.isClosed()));
}