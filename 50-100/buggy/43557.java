@java.lang.Override
protected com.AirMaps.AirMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    reactContext = context;
    com.AirMaps.AirMapView view = new com.AirMaps.AirMapView(context, this);
    try {
        com.google.android.gms.maps.MapsInitializer.initialize(this.reactActivity);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        emitMapError("Map initialize error", "map_init_error");
    }
    return view;
}