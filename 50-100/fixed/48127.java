@java.lang.Override
public void handleMessage(final android.os.Message msg) {
    final cgeo.geocaching.maps.mapsforge.v6.NewMap map = mapRef.get();
    if (map == null) {
        return ;
    }
    final int what = msg.what;
    switch (what) {
        case cgeo.geocaching.maps.mapsforge.v6.NewMap.UPDATE_TITLE :
            map.setTitle();
            map.setSubtitle();
            break;
        case cgeo.geocaching.maps.mapsforge.v6.NewMap.INVALIDATE_MAP :
            map.mapView.repaint();
            break;
        default :
            break;
    }
}