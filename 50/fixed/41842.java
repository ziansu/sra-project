@java.lang.Override
public java.nio.ByteBuffer createNewBuffer() throws java.io.IOException {
    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(1024);
    synchronized(bufTracker) {
        bufTracker.add(allocateDirect);
    }
    return allocateDirect;
}