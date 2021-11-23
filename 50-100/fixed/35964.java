@java.lang.Override
void setDataset(org.openstreetmap.josm.data.osm.DataSet dataSet) {
    super.setDataset(dataSet);
    if (((!(isIncomplete())) && (isVisible())) && (((getCoor()) == null) || ((getEastNorth()) == null)))
        throw new org.openstreetmap.josm.data.osm.DataIntegrityProblemException(("Complete node with null coordinates: " + (toString())));
    
}