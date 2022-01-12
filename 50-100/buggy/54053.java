private void attachWebcam(com.github.sarxos.webcam.Webcam newWebcam) {
    teaselib.TeaseLib.log(((newWebcam.getName()) + " connected"));
    newWebcam.setViewSize(ViewSize);
    newWebcam.open();
    showWebcamWindow(newWebcam);
    webcam = newWebcam;
    t = new teaselib.motiondetection.MotionDetector.WebCamThread();
    setAreaTreshold(areaTreshold);
    setPixelTreshold(pixelTreshold);
    t.start();
}