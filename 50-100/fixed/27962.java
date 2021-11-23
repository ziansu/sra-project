@java.lang.Override
public void handleMessage(final android.os.Message msg) {
    final cgeo.geocaching.maps.CGeoMap map = mapRef.get();
    if (map == null) {
        return ;
    }
    final int what = msg.what;
    switch (what) {
        case cgeo.geocaching.maps.CGeoMap.UPDATE_TITLE :
            map.setTitle();
            map.setSubtitle();
            break;
        case cgeo.geocaching.maps.CGeoMap.INVALIDATE_MAP :
            map.mapView.repaintRequired(null);
            break;
        default :
            break;
    }
}