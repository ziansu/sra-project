public void updateGeoLocation() {
    if ((this.geoLocation) == null) {
        this.geoLocation = new org.springframework.data.geo.Point(latitude, longitude);
    }
}