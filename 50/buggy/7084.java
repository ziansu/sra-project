public ffk27.mapviewer2.GeoDataSource getDataSource() {
    if (((dataSource) == null) && ((parent) != null)) {
        return parentDataSource(parent);
    }
    return dataSource;
}