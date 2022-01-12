public java.lang.Double getLongitude() {
    if (((((this.longitude) == null) && ((this.latD) != null)) && ((this.latM) != null)) && ((this.latS) != null)) {
        longitude = this.longD;
        longitude += (this.longM) / 60;
        longitude += (this.longS) / 3600;
    }
    return longitude;
}