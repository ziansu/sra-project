private boolean setPlaceName(com.dominika.florczykowska.placesfinder.classes.pojo.placedetail.Result placeDetail) {
    try {
        mNameTv.setText(placeDetail.getName());
        android.util.Log.d(com.dominika.florczykowska.placesfinder.fragments.PlaceDetailFragment.TAG, ("Received details about: " + (placeDetail.getName())));
    } catch (java.lang.NullPointerException e) {
        android.util.Log.e(com.dominika.florczykowska.placesfinder.fragments.PlaceDetailFragment.TAG, "name missing");
        mErrorMessageText.setVisibility(View.VISIBLE);
        mMainView.setVisibility(View.GONE);
        return false;
    }
    return true;
}