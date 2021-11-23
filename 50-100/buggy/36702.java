@com.runwaysdk.dataaccess.transaction.Transaction
private void generateThumbnailImage(net.geoprism.GeoprismUser[] users) {
    byte[] image = this.generateThumbnail();
    for (net.geoprism.GeoprismUser user : users) {
        net.geoprism.dashboard.DashboardState state = net.geoprism.dashboard.DashboardState.getDashboardState(this, user);
        if (state != null) {
            state.lock();
            state.setMapThumbnail(image);
            state.apply();
        }
    }
}