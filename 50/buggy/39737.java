public void setLongitude(double longitude) {
    assert (longitude >= (-180.0)) && ((latitude) <= 180.0) : "latitude has to be between -180.0 and 180.0";
    this.longitude = longitude;
}