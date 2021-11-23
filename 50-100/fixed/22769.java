private void renderOneCameraAndAddToList(final org.gearvrf.GVRPerspectiveCamera centerCamera, byte[][] byteArrays, int index) {
    renderCamera(mActivity.appPtr, mMainScene, centerCamera, mRenderBundle.getRightRenderTexture(), mRenderBundle);
    readRenderResult();
    byteArrays[index] = java.util.Arrays.copyOf(readbackBuffer.array(), readbackBuffer.array().length);
}