public java.util.ArrayList<java.lang.Integer> getThresholds() {
    if ((detectorAlgorithm) instanceof com.github.sarxos.webcam.WebcamMotionDetectorDefaultAlgorithm) {
        return ((com.github.sarxos.webcam.WebcamMotionDetectorDefaultAlgorithm) (detectorAlgorithm)).getThresholds();
    }else
        if ((detectorAlgorithm) instanceof com.github.sarxos.webcam.WebcamMotionDetectorDefaultWithDNE) {
            return ((com.github.sarxos.webcam.WebcamMotionDetectorDefaultWithDNE) (detectorAlgorithm)).getThresholds();
        }else {
            throw new java.lang.UnsupportedOperationException("This method is only valid for the default detector algorithm");
        }
    
}