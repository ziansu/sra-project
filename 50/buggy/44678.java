@java.lang.Override
protected void saveAllBuffers() throws java.io.IOException {
    java.nio.ByteBuffer message = null;
    while ((message = messages.poll()) != null) {
        saveBuffer(java.util.Collections.EMPTY_LIST, message);
    } 
}