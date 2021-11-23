@java.lang.Override
public boolean onTap(org.mapsforge.core.model.LatLong tapLatLong, org.mapsforge.core.model.Point layerXY, org.mapsforge.core.model.Point tapXY) {
    android.util.Log.d(Config.TAG, ("Map onTap" + tapLatLong));
    if ((marker) instanceof org.mixare.marker.LocalMarker) {
        org.mixare.marker.LocalMarker localMarker = ((org.mixare.marker.LocalMarker) (marker));
        localMarker.retrieveActionPopupMenu(this, mapView).show();
    }
    return true;
}