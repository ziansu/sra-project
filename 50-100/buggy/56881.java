private void addOrUpdateDashboardFragments() {
    android.util.Log.v(net.osmand.plus.dashboard.DashboardOnMap.TAG, ("addOrUpdateDashboardFragments(" + ")"));
    net.osmand.plus.OsmandSettings settings = getMyApplication().getSettings();
    net.osmand.plus.dashboard.tools.TransactionBuilder builder = new net.osmand.plus.dashboard.tools.TransactionBuilder(mapActivity.getSupportFragmentManager(), settings, mapActivity);
    android.util.Log.v(net.osmand.plus.dashboard.DashboardOnMap.TAG, ("pluginsCards=" + (net.osmand.plus.OsmandPlugin.getPluginsCardsList())));
    builder.addFragmentsData(net.osmand.plus.dashboard.DashboardOnMap.fragmentsData).addFragmentsData(net.osmand.plus.OsmandPlugin.getPluginsCardsList()).getFragmentTransaction().commit();
}