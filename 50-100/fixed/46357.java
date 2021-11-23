private boolean bind() {
    if ((address) == null)
        return false;
    
    try {
        socketAcceptor.unbind();
        socketAcceptor.bind(address);
    } catch (java.io.IOException e) {
        android.util.Log.e(com.stockholm.api.socket.AcceptorManager.TAG, ("bind error: " + (e.toString())));
        return false;
    }
    return true;
}