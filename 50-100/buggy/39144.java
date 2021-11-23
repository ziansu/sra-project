public void terminate() {
    synchronized(midiDeviceMap) {
        for (java.util.Map.Entry<java.lang.String, jp.kshoji.javax.sound.midi.usb.UsbMidiDevice> midiDeviceEntry : midiDeviceMap.entrySet()) {
            midiDeviceEntry.getValue().close();
        }
        midiDeviceMap.clear();
    }
    deviceConnectionWatcher.stop();
    deviceConnectionWatcher = null;
    usbManager = null;
}