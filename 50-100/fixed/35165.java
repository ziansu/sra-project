public java.lang.Double getLongitude() {
    if (((((this.longitude) == null) && ((this.longD) != null)) && ((this.longM) != null)) && ((this.longS) != null)) {
        longitude = this.longD;
        longitude += (this.longM) / 60;
        longitude += (this.longS) / 3600;
    }
    return longitude;
}