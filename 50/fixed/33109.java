public boolean hasCriticalMessages() {
    final net.osmand.plus.OsmandSettings settings = getMyApplication().getSettings();
    return (net.osmand.plus.dashboard.DashboardOnMap.rateUsShouldShow.shouldShow(settings, mapActivity, DashRateUsFragment.TAG)) || (net.osmand.plus.dashboard.DashboardOnMap.errorShouldShow.shouldShow(null, mapActivity, null));
}