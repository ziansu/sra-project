@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    if ((tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.MapsActivity.current_zoom_level) != (cameraPosition.zoom)) {
        tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.MapsActivity.current_zoom_level = cameraPosition.zoom;
        tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.LogUtils.debug(("Current zoom level is:" + (cameraPosition.zoom)));
        if ((tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.MapsActivity.number_of_visible_markers) <= (tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.MapsActivity.number_of_labeled_markers_threshold)) {
            update_labeled_icons("add");
        }else
            if ((tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.MapsActivity.current_zoom_level) < (tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden.MapsActivity.zoom_level_threshold)) {
                update_labeled_icons("remove");
            }
        
    }
}