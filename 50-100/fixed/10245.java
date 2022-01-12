@com.facebook.react.uimanager.annotations.ReactProp(name = "polylines")
public void setPolylines(com.baidu.mapapi.map.MapView mapView, com.facebook.react.bridge.ReadableArray options) {
    for (int i = 0; i < (options.size()); i++) {
        com.facebook.react.bridge.ReadableMap option = options.getMap(i);
        org.lovebing.reactnative.baidumap.MarkerUtil.addPolyline(mapView, option.getString("color"), option.getInt("width"), option.getArray("points"));
    }
}