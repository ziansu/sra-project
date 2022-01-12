public org.openstreetmap.josm.data.conflict.Conflict<? extends org.openstreetmap.josm.data.osm.OsmPrimitive> getSelectedConflict() {
    if (((conflicts) == null) || ((model.getSize()) == 0))
        return null;
    
    int index = lstConflicts.getSelectedIndex();
    if (index < 0)
        return null;
    
    return conflicts.get(index);
}