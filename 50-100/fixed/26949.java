@java.lang.Override
public void onStop() {
    if ((publish) != null) {
        publish.stop();
        if ((publish.getVideoSource()) != null) {
            android.hardware.Camera c = ((com.red5pro.streaming.source.R5Camera) (publish.getVideoSource())).getCamera();
            c.stopPreview();
            c.release();
        }
        publish = null;
    }
    super.onStop();
}