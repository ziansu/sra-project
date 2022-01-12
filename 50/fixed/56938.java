private void setCameraOptions() {
    videoCapture.set(Highgui.CV_CAP_PROP_FRAME_WIDTH, 320);
    videoCapture.set(Highgui.CV_CAP_PROP_FRAME_HEIGHT, 240);
}