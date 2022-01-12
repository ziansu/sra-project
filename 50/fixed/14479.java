public void updateTabUnreadCounts() {
    if ((mHasActiveVoicemailProvider) && ((mCallLogQueryHandler) != null)) {
        mCallLogQueryHandler.fetchVoicemailUnreadCount();
    }
}