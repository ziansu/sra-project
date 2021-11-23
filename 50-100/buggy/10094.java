protected int draw() {
    mSurfaceTexture.updateTexImage();
    float[] matrix = new float[16];
    mSurfaceTexture.getTransformMatrix(matrix);
    mEffect.setTextureTransformMatrix(matrix);
    int textureId = mEffect.draw(mSurfaceTextureId);
    mRendererScreen.draw(textureId, mCubeBuffer, mTextureBuffer);
    if ((mEncoder) != null) {
        start = java.lang.System.currentTimeMillis();
        mHandler.sendEmptyMessage(0);
    }
    return 0;
}