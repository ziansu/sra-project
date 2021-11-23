public int indexOf(org.openstreetmap.josm.data.osm.OsmPrimitive my) {
    if ((conflicts) == null)
        return -1;
    
    for (int i = 0; i < (conflicts.size()); i++) {
        if (conflicts.get(i).isMatchingMy(my))
            return i;
        
    }
    return -1;
}