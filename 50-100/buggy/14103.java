@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    android.util.Log.d(com.flipcam.VideoFragment.TAG, ("progress = " + progress));
    if (cameraView.isSmoothZoomSupported()) {
        android.util.Log.d(com.flipcam.VideoFragment.TAG, "Smooth zoom supported");
        cameraView.smoothZoomInOrOut(progress);
    }else
        if (cameraView.isZoomSupported()) {
            cameraView.zoomInAndOut(progress);
        }
    
}