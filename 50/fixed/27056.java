private de.saschafeldmann.adesso.master.thesis.detection.algorithm.DetectionOptions newDetectionOptions() {
    de.saschafeldmann.adesso.master.thesis.detection.algorithm.DetectionOptions detectionOptions = new de.saschafeldmann.adesso.master.thesis.detection.algorithm.DetectionOptions();
    detectionOptions.setNumberOfFilltextQuestions(detectionOptions.getNumberOfFilltextQuestions());
    detectionOptions.setNumberOfCardinalityQuestions(detectionOptions.getNumberOfCardinalityQuestions());
    return detectionOptions;
}