private void updateInfoLayout() {
    if ((mReactable.getDirector()) != null) {
        mDirectorName.set(mReactable.getDirector().getDisplayName());
        if (mReactable.getDirector().equals(com.truethat.android.application.AppContainer.getAuthManager().getCurrentUser())) {
            mDirectorNameVisibility.set(false);
        }
    }
    mTimeAgoText.set(com.truethat.android.common.util.DateUtil.formatTimeAgo(mReactable.getCreated()));
}