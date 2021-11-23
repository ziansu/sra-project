@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.return_to_actual_Position :
            mapController.setCenter(io.github.data4all.util.MapUtil.getCenterFromOsmElement(element));
            final org.osmdroid.util.BoundingBoxE6 boundingBox = io.github.data4all.util.MapUtil.getBoundingBoxForOsmElement(element);
            mapView.zoomToBoundingBox(boundingBox);
            break;
        case R.id.switch_maps :
            switchMaps();
            mapView.getOverlays().clear();
            setUpOverlays();
            break;
        case R.id.okay :
            this.accept();
            break;
        default :
            break;
    }
}