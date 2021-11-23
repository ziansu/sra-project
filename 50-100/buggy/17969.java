void onPlaceChanged(long _id) {
    android.net.Uri uri = mUri;
    if (null != uri) {
        java.lang.String placeId = PlacesContract.PlacesEntry.getPlaceIdFromUri(uri);
        android.net.Uri updatedUri = PlacesContract.PlacesEntry.buildPlaceUri(_id);
        mUri = updatedUri;
        getLoaderManager().restartLoader(net.brightron.jayaneetha.visitmihinthale.DetailFragment.DETAIL_LOADER, null, this);
    }
}