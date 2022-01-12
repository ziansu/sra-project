@java.lang.Override
protected void updateTrackingUI(boolean isTracking) {
    super.updateTrackingUI(isTracking);
    nextActivityButton.setEnabled(isTracking);
    stopTrackingButton.setEnabled(isTracking);
    eventNotesButton.setEnabled(isTracking);
    int image = (isTracking) ? R.drawable.maps_on : R.drawable.maps_off;
    viewMapButton.setImageResource(image);
    dropDown.setEnabled(isTracking);
    newTagButton.setEnabled(isTracking);
    dropDown.setSelection(0);
}