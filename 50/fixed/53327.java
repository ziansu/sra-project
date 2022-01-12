@java.lang.Override
protected com.shadark.android.react.amaps.mapview.ATextureMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    com.amap.api.maps.AMapOptions options = new com.amap.api.maps.AMapOptions();
    return new com.shadark.android.react.amaps.mapview.ATextureMapView(reactContext, mAppContext, this, options);
}