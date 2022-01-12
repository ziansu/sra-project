@java.lang.Override
protected void saveAllBuffers() throws java.io.IOException {
    java.nio.ByteBuffer message;
    while ((message = messages.poll()) != null) {
        saveBuffer(new java.util.ArrayList<java.lang.String>(), message);
    } 
}