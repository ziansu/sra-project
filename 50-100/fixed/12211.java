public final synchronized jogamp.opengl.GLBufferStorage mapBuffer(final int bufferName, final long offset, final long length, final int access, final jogamp.opengl.GLBufferObjectTracker.MapBufferRangeDispatch dispatch, final long glProcAddress) throws jogamp.opengl.GLException {
    return this.mapBufferImpl(0, bufferName, true, true, offset, length, access, dispatch, glProcAddress);
}