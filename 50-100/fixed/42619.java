@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (cameraView.isCameraReady()) {
        if (cameraView.isSmoothZoomSupported()) {
            cameraView.smoothZoomInOrOut(progress);
        }else
            if (cameraView.isZoomSupported()) {
                cameraView.zoomInAndOut(progress);
            }
        
    }
}