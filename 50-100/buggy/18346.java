private void goToPreviousFrame() {
    if ((actualFrameIndex) > 1) {
        (actualFrameIndex)--;
        videoReader.setFrameWithImage(actualFrame, actualFrameIndex);
        if (!(keepReferenceFrame)) {
            (referenceFrameIndex)--;
            videoReader.setFrameWithImage(referenceFrame, referenceFrameIndex);
        }
    }
}