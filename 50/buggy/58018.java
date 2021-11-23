@java.lang.Override
public void handle(de.westnordost.osmapi.map.data.Element element, de.westnordost.streetcomplete.data.osm.ElementGeometry geometry) {
    housenumberCoords.add(de.westnordost.streetcomplete.util.JTSConst.toPoint(geometry.center));
}