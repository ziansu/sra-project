@java.lang.Override
public void free() {
    if (free) {
        return ;
    }
    freePoint = new java.lang.RuntimeException("FREE POINT");
    free = true;
    io.undertow.testutils.DebuggingSlicePool.BUFFERS.remove(this);
    delegate.free();
}