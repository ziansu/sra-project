@java.lang.Override
public boolean init(net.osmand.plus.OsmandApplication app, android.app.Activity activity) {
    routing = app.getRoutingHelper();
    routing.addListener(new net.osmand.plus.smartnaviwatch.SmartNaviWatchPlugin.RoutingAdapter());
    location = app.getLocationProvider();
    location.addLocationListener(new net.osmand.plus.smartnaviwatch.SmartNaviWatchPlugin.LocationAdapter());
    getServiceConnector().addMessageListener(this);
    return true;
}