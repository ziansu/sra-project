@java.lang.Override
public void onLegIndexChanged(int legOrder) {
    com.paranoidandroid.journey.legplanner.fragments.MapViewFragment fragment = getMapViewFragment();
    if (fragment.isZoomed()) {
        fragment.addMarkersFromLegs(mJourney.getLegs());
        fragment.setZoomed(false);
        fabZoom.setImageResource(R.drawable.ic_zoom_in);
    }
    fragment.changeToMarkerPosition(legOrder);
}