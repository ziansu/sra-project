private void renderOneCameraAndAddToList(final org.gearvrf.GVRPerspectiveCamera centerCamera, java.nio.ByteBuffer readbackBuffer, byte[][] byteArrays, int index) {
    renderCamera(mActivity.appPtr, mMainScene, centerCamera, mRenderBundle.getRightRenderTexture(), mRenderBundle);
    readRenderResult(mRenderBundle.getPostEffectRenderTextureA().getPtr(), readbackBuffer);
    byteArrays[index] = java.util.Arrays.copyOf(readbackBuffer.array(), readbackBuffer.array().length);
}