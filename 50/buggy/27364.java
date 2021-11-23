@java.lang.Override
public void onRenderBufferDone(java.nio.ByteBuffer buffer) {
    com.Yamate.Camera.Util.RawToJpeg(buffer.array(), mCamera.getCaptureSize().getWidth(), mCamera.getCaptureSize().getHeight(), mExifJpeg);
}