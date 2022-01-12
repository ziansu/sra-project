public boolean isModified() {
    return (!(this.getLatLon().equals(this.latLon))) || ((java.lang.Math.abs(((this.getCa()) - (this.ca)))) > (org.openstreetmap.josm.plugins.mapillary.MapillaryAbstractImage.EPSILON));
}