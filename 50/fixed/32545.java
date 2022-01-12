public void setTextureBuffer(final java.nio.FloatBuffer textureBuffer) {
    if (textureBuffer != null) {
        textureBuffer.rewind();
        this.textureBuffer = com.ardor3d.util.geom.BufferUtils.clone(textureBuffer);
    }else {
        this.textureBuffer = null;
    }
}