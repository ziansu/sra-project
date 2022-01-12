@org.junit.Test
public void createDatasetFromJSON() {
    data = new org.json.JSONObject();
    if ((data.getInt("schemaVersion")) == 1) {
        datasetV1 = eu.rethink.globalregistry.model.Dataset_V1.createFromJSONObject(data);
        assertTrue(((datasetV1) != null));
    }
    if ((data.getInt("schemaVersion")) == 2) {
        datasetV2 = eu.rethink.globalregistry.model.Dataset_V2.createFromJSONObject(data);
        assertTrue(((datasetV2) != null));
    }
}