public com.wasteofplastic.beaconz.Game getGame(java.awt.geom.Line2D link) {
    return getGame(getRegion(((int) (link.getX1())), ((int) (link.getY1()))));
}