@java.lang.Override
public void grab() {
    if (this.isClosing()) {
        return ;
    }
    if (this.captureIpl.available()) {
        captureIpl.read();
        org.bytedeco.javacpp.opencv_core.IplImage img = captureIpl.getIplImage();
        if (img != null) {
            updateCurrentImage(img);
        }
    }else {
        waitForNextFrame();
    }
}