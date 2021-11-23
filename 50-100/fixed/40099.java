public org.openstreetmap.josm.plugins.mapillary.MapillaryAbstractImage previous(org.openstreetmap.josm.plugins.mapillary.MapillaryAbstractImage image) {
    int i = this.images.indexOf(image);
    if (i < 0) {
        throw new java.lang.IllegalArgumentException();
    }
    if (i == 0) {
        return null;
    }
    return this.images.get((i - 1));
}