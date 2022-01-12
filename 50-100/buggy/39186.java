@java.lang.Override
public void onDeviceOpened(android.media.midi.IMidiDeviceServer server, android.os.IBinder deviceToken) {
    android.media.midi.MidiDevice device = null;
    if (server != null) {
        try {
            android.media.midi.MidiDeviceInfo deviceInfo = server.getDeviceInfo();
            device = new android.media.midi.MidiDevice(deviceInfo, server, mService, mToken, deviceToken);
            sendOpenDeviceResponse(device, listenerF, handlerF);
        } catch (android.os.RemoteException e) {
            android.util.Log.e(android.media.midi.MidiManager.TAG, "remote exception in getDeviceInfo()");
        }
    }
    sendOpenDeviceResponse(device, listenerF, handlerF);
}