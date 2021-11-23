private void goToNextFrame() {
    if ((actualFrameIndex) < (framesTotal)) {
        (actualFrameIndex)++;
        videoReader.setFrameWithImage(actualFrame, actualFrameIndex);
        if ((!(keepReferenceFrame)) && ((referenceFrameIndex) < (framesTotal))) {
            (referenceFrameIndex)++;
            videoReader.setFrameWithImage(referenceFrame, referenceFrameIndex);
        }
    }
}