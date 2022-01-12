private int getNodeHash(net.osmand.osm.edit.Entity e) {
    int y = net.osmand.util.MapUtils.get31TileNumberY(((net.osmand.osm.edit.Node) (e)).getLatitude());
    int x = net.osmand.util.MapUtils.get31TileNumberX(((net.osmand.osm.edit.Node) (e)).getLongitude());
    int v = e.getVersion();
    int hash = ((x + y) + v) >> 10;
    return hash;
}