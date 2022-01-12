public void run() {
    mUserProfile = payload;
    mFacade.updateUserProfile(payload);
    if (mAccountTypeSpinner.getSelectedItem().toString().equals("Manager")) {
        mHistoryButton.setVisibility(View.VISIBLE);
    }else {
        mHistoryButton.setVisibility(View.GONE);
    }
}