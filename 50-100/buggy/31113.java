public void run() {
    mUserProfile = payload;
    mFacade.updateUserProfile(mClient);
    if (mAccountTypeSpinner.getSelectedItem().toString().equals("Manager")) {
        mHistoryButton.setVisibility(View.VISIBLE);
    }else {
        mHistoryButton.setVisibility(View.GONE);
    }
}