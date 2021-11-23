public void addPaperDimensions(javafx.geometry.Dimension2D newPaperDimensions, boolean averagePatterns) {
    if ((!(paperDimensions.isPresent())) || (!averagePatterns)) {
        paperDimensions = java.util.Optional.of(newPaperDimensions);
        com.shootoff.camera.autocalibration.AutoCalibrationManager.logger.trace("Found paper dimensions {}", paperDimensions.get());
    }else
        if ((paperDimensions.isPresent()) && averagePatterns) {
            paperDimensions = java.util.Optional.of(averageDimensions(paperDimensions.get(), newPaperDimensions));
            com.shootoff.camera.autocalibration.AutoCalibrationManager.logger.trace("Averaged paper dimensions {}", paperDimensions.get());
        }
    
}