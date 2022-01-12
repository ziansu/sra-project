@java.lang.Override
protected com.airbnb.android.react.maps.AirMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    reactContext = context;
    try {
        com.google.android.gms.maps.MapsInitializer.initialize(com.airbnb.android.react.maps.ActivityManager.getInstance().getActivity());
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
        emitMapError("Map initialize error", "map_init_error");
    }
    return new com.airbnb.android.react.maps.AirMapView(context, com.airbnb.android.react.maps.ActivityManager.getInstance().getActivity(), this);
}