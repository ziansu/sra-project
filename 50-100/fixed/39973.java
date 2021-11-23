public void setDataSet(final org.openstreetmap.josm.plugins.scoutsigns.entity.DataSet dataSet) {
    if ((!(selRoadSigns.isEmpty())) && ((dataSet.getRoadSigns()) != null)) {
        for (final org.openstreetmap.josm.plugins.scoutsigns.entity.RoadSign elem : dataSet.getRoadSigns()) {
            if (!(this.dataSet.getRoadSigns().contains(elem))) {
                selRoadSigns.remove(elem);
            }
        }
    }
    this.dataSet = dataSet;
}