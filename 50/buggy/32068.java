public com.vividsolutions.jts.geom.Geometry build(de.topobyte.osm4j.core.model.iface.OsmWay way, de.topobyte.osm4j.core.resolve.OsmEntityProvider resolver) throws de.topobyte.osm4j.core.resolve.EntityNotFoundException {
    return wayBuilder.buildThrowExceptionIfNodeMissing(way, resolver).toGeometry(factory);
}