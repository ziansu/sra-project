private boolean handleSearchButtonClicked(int actionId) {
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