@java.lang.Override
public void transfer(hs_mannheim.gestureframework.model.Packet packet) {
    android.util.Log.d(TAG, ("Sending " + packet));
    if (isConnected()) {
        this.mConnectionThread.write(packet);
    }
}