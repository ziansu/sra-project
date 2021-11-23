public boolean loadDatabase() throws java.io.IOException {
    final java.io.File existingDB = databasesDirectory.resolve(databaseName).toFile();
    if ((!(existingDB.exists())) || (!(existingDB.canRead()))) {
        return false;
    }
    return com.comcast.cdn.traffic_control.traffic_router.core.loc.RegionalGeo.parseConfigFile(existingDB);
}