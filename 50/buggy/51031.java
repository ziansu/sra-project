public com.wasteofplastic.beaconz.Game getGame(java.awt.geom.Line2D link) {
    return getGame(getRegion(link.getX1(), link.getY1()));
}