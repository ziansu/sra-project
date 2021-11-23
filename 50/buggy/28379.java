@java.lang.Override
public void imageStarted(javax.imageio.ImageReader source, int imageIndex) {
    if (isProgressRangeCorrected()) {
        processImageStarted(imageIndex);
    }
}