private void goToNextFrame() {
    if ((actualFrameIndex) < (framesTotal)) {
        (actualFrameIndex)++;
        videoReader.setFrameWithImage(actualFrame, actualFrameIndex);
        if (!(keepReferenceFrame)) {
            (referenceFrameIndex)++;
            videoReader.setFrameWithImage(referenceFrame, referenceFrameIndex);
        }
    }
}