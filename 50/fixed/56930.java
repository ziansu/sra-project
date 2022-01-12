@java.lang.Override
public boolean onMarkerClick(com.baidu.mapapi.map.Marker marker) {
    showPopWindow(marker);
    return false;
}