private void syncAllServices() {
    for (java.util.Map.Entry<java.lang.String, ir.atitec.signalgo.util.ClientDuplex> entry : mPendingServices.entrySet()) {
        syncService(entry.getKey());
    }
    currentState = GoSocketListener.SocketState.Connected;
    if ((socketListener) != null) {
        socketListener.onSocketChange(lastState, currentState);
    }
}