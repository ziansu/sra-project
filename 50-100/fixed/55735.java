private void doEndChannel(pit.Marker marker) throws java.lang.Exception {
    int source = marker.source;
    incoming.put(source, true);
    if (checkTermination()) {
        java.lang.String sendToJNDI = "jms/PITsnapshot";
        sendToQueue(sendToJNDI, state);
        resetSnapshot();
    }
}