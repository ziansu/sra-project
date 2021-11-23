@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((deviceConnectionWatcher) != null) {
        deviceConnectionWatcher.stop();
    }
    deviceConnectionWatcher = null;
    midiInputDevice = null;
    midiOutputDevice = null;
    deviceConnection = null;
    android.widget.Toast.makeText(this, "MIDI Service stopped", Toast.LENGTH_SHORT).show();
}