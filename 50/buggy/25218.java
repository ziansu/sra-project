@java.lang.Override
public void onRecordFrame(final java.nio.ByteBuffer frame) {
    android.util.Log.i(com.serenegiant.usbcameracommon.AbstractUVCCameraHandler.CameraThread.TAG_THREAD, (("IFrameCallback#onRecordFrame: Received a frame, length: " + (frame.capacity())) + " bytes"));
}