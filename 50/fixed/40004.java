final java.util.Optional<com.trch.IProcessMessage> takeProcessMessage() {
    synchronized(processMessages) {
        if (hasAnyMessages()) {
            return java.util.Optional.of(processMessages.remove());
        }
        return java.util.Optional.empty();
    }
}