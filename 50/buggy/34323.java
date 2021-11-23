private void enableActions() {
    final boolean isTourInDb = isTourSavedInDb();
    final boolean isSingleTour = ((_tourData) != null) & ((_tourData.isMultipleTours) == false);
    _actionEditTourMarkers.setEnabled((isTourInDb && isSingleTour));
}