public java.lang.Double getLatitude() {
    org.vaadin.addon.vol3.client.OLCoordinate coordinate = this.getElements().get(0);
    return coordinate.y;
}