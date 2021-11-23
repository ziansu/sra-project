private void doEndChannel(pit.Marker marker) throws java.lang.Exception {
    int source = marker.source;
    incoming.put(source, true);
    if (checkTermination()) {
        java.lang.String sendToJNDI = "jms/PITsnapshot";
        java.lang.System.out.println(("[Report state] = player " + (myPlayerNumber)));
        sendToQueue(sendToJNDI, state);
        resetSnapshot();
    }
}