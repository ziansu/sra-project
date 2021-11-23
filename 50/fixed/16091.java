private synchronized void notifyListeners(org.openhab.binding.upb.internal.UPBMessage message) {
    for (org.openhab.binding.upb.internal.UPBReader.Listener l : new java.util.ArrayList<>(listeners)) {
        l.messageReceived(message);
    }
}