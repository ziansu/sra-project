@java.lang.Override
public void grab() {
    if (this.isClosing()) {
        return ;
    }
    while (!(this.captureIpl.available())) {
        waitForNextFrame();
    } 
    captureIpl.read();
    org.bytedeco.javacpp.opencv_core.IplImage img = captureIpl.getIplImage();
    if (img != null) {
        updateCurrentImage(img);
    }
}