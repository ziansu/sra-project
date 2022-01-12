@java.lang.Override
public void handle(@android.support.annotation.NonNull
de.westnordost.osmapi.map.data.Element element, @android.support.annotation.Nullable
de.westnordost.streetcomplete.data.osm.ElementGeometry geometry) {
    if (geometry == null)
        return ;
    
    com.vividsolutions.jts.geom.Geometry g = de.westnordost.streetcomplete.util.JTSConst.toGeometry(geometry);
    for (com.vividsolutions.jts.geom.Point p : housenumberCoords) {
        if (g.covers(p))
            return ;
        
    }
    handler.handle(element, geometry);
}