private void initUserFields() {
    java.util.List<java.lang.String> userData = mDataManager.getPreferencesManager().loadUserProfileData();
    for (int i = 0; i < (mUserInfoViews.size()); i++) {
        mUserInfoViews.get(i).setText(userData.get(i));
    }
    mNavTxtEmailView.setText(userData.get(1));
    mNavTxtNameView.setText(userData.get(((userData.size()) - 1)));
}