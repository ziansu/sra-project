@java.lang.Override
public void handleBinaryMessage(java.util.UUID from, java.nio.ByteBuffer message) {
    if ((state) == (edu.sharif.behin.androidstreamer.network.ViewerWebSocketHandler.ViewerState.PLAYING)) {
        if (from.equals(sourceUUID)) {
            networkInputStream.addDataToBuffer(message);
        }else {
            android.util.Log.e(edu.sharif.behin.androidstreamer.network.ViewerWebSocketHandler.class.getName(), ("Message Came from wrong source : " + (sourceUUID)));
            serverWebSocketHandler.sendStringMessage(from, Constants.FAULT_MESSAGE);
        }
    }else {
        android.util.Log.e(edu.sharif.behin.androidstreamer.network.ViewerWebSocketHandler.class.getName(), "Viewer Cannot Handle Binary Messages in STOPPED State");
        serverWebSocketHandler.sendStringMessage(from, Constants.FAULT_MESSAGE);
    }
}