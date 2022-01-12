@java.lang.Override
public java.util.List<com.facebook.react.uimanager.ViewManager> createViewManagers(com.facebook.react.bridge.ReactApplicationContext reactContext) {
    com.airbnb.android.react.maps.AirMapCalloutManager calloutManager = new com.airbnb.android.react.maps.AirMapCalloutManager();
    com.airbnb.android.react.maps.AirMapMarkerManager annotationManager = new com.airbnb.android.react.maps.AirMapMarkerManager();
    com.airbnb.android.react.maps.AirMapPolylineManager polylineManager = new com.airbnb.android.react.maps.AirMapPolylineManager(reactContext);
    com.airbnb.android.react.maps.AirMapPolygonManager polygonManager = new com.airbnb.android.react.maps.AirMapPolygonManager(reactContext);
    com.airbnb.android.react.maps.AirMapCircleManager circleManager = new com.airbnb.android.react.maps.AirMapCircleManager(reactContext);
    com.airbnb.android.react.maps.AirMapManager mapManager = new com.airbnb.android.react.maps.AirMapManager();
    return java.util.Arrays.<com.facebook.react.uimanager.ViewManager>asList(calloutManager, annotationManager, polylineManager, polygonManager, circleManager, mapManager);
}