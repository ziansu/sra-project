public org.openstreetmap.josm.data.conflict.Conflict<? extends org.openstreetmap.josm.data.osm.OsmPrimitive> getSelectedConflict() {
    if (((conflicts) == null) || ((model.getSize()) == 0))
        return null;
    
    int index = lstConflicts.getSelectedIndex();
    return index >= 0 ? conflicts.get(index) : null;
}