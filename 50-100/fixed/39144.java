public void terminate() {
    synchronized(midiDeviceMap) {
        for (final java.util.Map.Entry<java.lang.String, jp.kshoji.javax.sound.midi.usb.UsbMidiDevice> midiDeviceEntry : midiDeviceMap.entrySet()) {
            midiDeviceEntry.getValue().close();
        }
        midiDeviceMap.clear();
    }
    if ((deviceConnectionWatcher) != null) {
        deviceConnectionWatcher.stop();
        deviceConnectionWatcher = null;
    }
    usbManager = null;
}