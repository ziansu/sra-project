@java.lang.Override
public boolean init(net.osmand.plus.OsmandApplication app, android.app.Activity activity) {
    routing = app.getRoutingHelper();
    location = app.getLocationProvider();
    routing.addListener(new net.osmand.plus.smartnaviwatch.SmartNaviWatchPlugin.RoutingAdapter());
    location.addLocationListener(new net.osmand.plus.smartnaviwatch.SmartNaviWatchPlugin.LocationAdapter());
    getServiceConnector().addMessageListener(this);
    return true;
}