private boolean handleSearchButtonClicked(int actionId) {
    android.util.Log.v(au.com.kbrsolutions.spotifystreamer.fragments.ArtistsFragment.LOG_TAG, "handleSearchButtonClicked - start");
    boolean handled = false;
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH)) {
        mArtistName = mSearchText.getText().toString();
        if ((mArtistName.trim().length()) > 0) {
            sendArtistsDataRequestToSpotify(mArtistName);
            handled = true;
            hideKeyboard();
        }else {
            mSearchText.setText("");
        }
    }
    return handled;
}