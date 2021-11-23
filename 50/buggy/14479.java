public void updateTabUnreadCounts() {
    if (mHasActiveVoicemailProvider) {
        mCallLogQueryHandler.fetchVoicemailUnreadCount();
    }
}