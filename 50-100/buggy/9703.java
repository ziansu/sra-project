public void setMinDateInMs(long minDateInMs) {
    this.minDateInMs = minDateInMs;
    if ((this.minDateInMs) > 0) {
        addSubmissionsToMap(this.googleMap.getProjection().getVisibleRegion());
    }else {
        addSubmissionsToMap(this.googleMap.getProjection().getVisibleRegion());
    }
}