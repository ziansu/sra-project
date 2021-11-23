private void updateDesiredHeight() {
    filteredDesiredCoMHeight.update();
    double zHeight = filteredDesiredCoMHeight.getDoubleValue();
    desiredCoMPosition.setZ(zHeight);
}