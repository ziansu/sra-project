@java.lang.Override
public org.openstreetmap.josm.data.osm.OsmPrimitive getElementAt(int index) {
    if (index < 0)
        return null;
    
    if (index >= (getSize()))
        return null;
    
    return conflicts.get(index).getMy();
}