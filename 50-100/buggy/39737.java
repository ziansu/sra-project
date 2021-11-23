private void closeMux() {
    synchronized(this) {
        if ((discoveryChannel) != null) {
            discoveryChannel.destroy();
            discoveryChannel = null;
        }
        if ((usbMux) != null) {
            usbMux.stop();
            usbMux.destroy();
            usbMux = null;
        }
        if ((muxFileDescriptor) != null) {
            try {
                muxFileDescriptor.close();
            } catch (java.io.IOException e) {
            }
            muxFileDescriptor = null;
        }
    }
}