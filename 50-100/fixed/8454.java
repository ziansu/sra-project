private void showLatLonPicker() {
    if (fromGui(mFilter)) {
        final android.app.FragmentManager manager = getFragmentManager();
        de.k3b.android.androFotoFinder.locationmap.LocationMapFragment dirDialog = new de.k3b.android.androFotoFinder.locationmap.LocationMapFragment();
        dirDialog.defineNavigation(null, mFilter, ZoomUtil.NO_ZOOM, null);
        dirDialog.show(manager, de.k3b.android.androFotoFinder.GalleryFilterActivity.DLG_NAVIGATOR_TAG);
    }
}