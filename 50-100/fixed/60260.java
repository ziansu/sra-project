private void showFavoriteStops() {
    android.util.Log.v(TAG, "showFavoriteStops - start");
    if ((mFavoriteStopsFragment) == null) {
        android.util.Log.v(TAG, "showFavoriteStops - adding new mFavoriteStopsFragment");
        mFavoriteStopsFragment = new au.com.kbrsolutions.melbournepublictransport.fragments.FavoriteStopsFragment();
        mFavoriteStopsFragment.setFragmentId(au.com.kbrsolutions.melbournepublictransport.activities.MainActivity.FragmentsId.FAVORITE_STOPS);
        mFavoriteStopsFragment.setActionBarTitle(getResources().getString(R.string.title_favorite_stops));
    }
    getSupportFragmentManager().beginTransaction().add(R.id.left_dynamic_fragments_frame, mFavoriteStopsFragment, au.com.kbrsolutions.melbournepublictransport.activities.MainActivity.FAVORITE_STOPS_TAG).commit();
}