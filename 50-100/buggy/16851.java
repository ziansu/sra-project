private void setPointOfInterest(org.charmeck.trailofhistory.core.model.PointOfInterest pointOfInterest) {
    this.pointOfInterest = pointOfInterest;
    nameField.setText(pointOfInterest.getName());
    locationField.setText(getString(R.string.location_format_string, pointOfInterest.getLatitude(), pointOfInterest.getLongitude()));
    descriptionField.setText(pointOfInterest.getDescription());
}