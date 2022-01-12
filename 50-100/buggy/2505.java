@java.lang.Override
public void handle(de.westnordost.osmapi.map.data.Element element, de.westnordost.streetcomplete.data.osm.ElementGeometry geometry) {
    com.vividsolutions.jts.geom.Geometry g = de.westnordost.streetcomplete.util.JTSConst.toGeometry(geometry);
    for (com.vividsolutions.jts.geom.Point p : housenumberCoords) {
        if (g.covers(p))
            return ;
        
    }
    handler.handle(element, geometry);
}