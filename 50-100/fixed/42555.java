@java.lang.Override
public org.softshack.trackme.DataSetMapper convertData() throws org.json.JSONException {
    if (((this.data) != null) && (!(this.data.isEmpty()))) {
        java.util.ArrayList<com.google.maps.android.heatmaps.WeightedLatLng> array = jsonFactory.readItems(this.data);
        return this.dataSetMapperFactory.createDataSetMapper(array, this.getMapDataSetName());
    }
    return null;
}