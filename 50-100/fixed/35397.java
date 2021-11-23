public boolean loadDatabase() throws java.io.IOException, org.apache.wicket.ajax.json.JSONException {
    final java.io.File existingDB = databasesDirectory.resolve(databaseName).toFile();
    if ((!(existingDB.exists())) || (!(existingDB.canRead()))) {
        return false;
    }
    return (com.comcast.cdn.traffic_control.traffic_router.core.loc.NetworkNode.generateTree(existingDB)) != null;
}