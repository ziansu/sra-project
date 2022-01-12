private void updateFrames(org.opencv.core.Mat cameraFrame) {
    currentImage.copyTo(previousImage);
    nextImage.copyTo(currentImage);
    cameraFrame.copyTo(nextImage);
}