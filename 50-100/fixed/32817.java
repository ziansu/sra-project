private void startTour(java.lang.String transportMode, java.lang.String type) {
    if (((tourService) != null) && (!(tourService.isRunning()))) {
        color = getTrackColor(false, type, new java.util.Date());
        tourService.beginTreatment(transportMode, type);
    }
}