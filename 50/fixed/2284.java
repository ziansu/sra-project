private void saveImage() {
    if (saveImage) {
        org.bytedeco.javacpp.opencv_highgui.cvSaveImage("PATH", croppedFace);
    }
}