final java.util.Optional<com.trch.IProcessMessage> takeProcessMessage() {
    if (hasAnyMessages()) {
        return java.util.Optional.of(processMessages.remove());
    }
    return java.util.Optional.empty();
}