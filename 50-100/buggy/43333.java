@java.lang.Override
public void onPolygonClick(com.google.android.gms.maps.model.Polygon polygon) {
    if ((getFeature(polygon)) != null) {
        listener.onFeatureClick(getFeature(polygon));
    }else
        if ((getContainerFeature(polygon)) != null) {
            listener.onFeatureClick(mContainerFeatures.getKey(polygon));
        }else {
            listener.onFeatureClick(getFeature(multiObjectHandler(polygon)));
        }
    
}