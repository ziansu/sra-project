@java.lang.Override
protected com.AirMaps.AirMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    reactContext = context;
    try {
        com.google.android.gms.maps.MapsInitializer.initialize(reactActivity);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        emitMapError("Map initialize error", "map_init_error");
    }
    com.AirMaps.AirMapView view = new com.AirMaps.AirMapView(context, reactActivity, this);
    return view;
}