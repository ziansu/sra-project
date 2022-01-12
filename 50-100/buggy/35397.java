public boolean loadDatabase() throws java.io.IOException, org.apache.wicket.ajax.json.JSONException {
    final java.io.File existingDB = databasesDirectory.resolve(databaseName).toFile();
    if ((!(existingDB.exists())) || (!(existingDB.canRead()))) {
        return false;
    }
    if (null == (com.comcast.cdn.traffic_control.traffic_router.core.loc.NetworkNode.generateTree(existingDB))) {
        return false;
    }
    return true;
}