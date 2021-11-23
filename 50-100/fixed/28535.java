public void updateTypesToAccept(net.osmand.osm.AbstractPoiType pt) {
    pt.putTypes(acceptedTypes);
    if (((pt instanceof net.osmand.osm.PoiType) && (((net.osmand.osm.PoiType) (pt)).isAdditional())) && ((((net.osmand.osm.PoiType) (pt)).getParentType()) != null)) {
        fillPoiAdditionals(((net.osmand.osm.PoiType) (pt)).getParentType());
    }else {
        fillPoiAdditionals(pt);
    }
}