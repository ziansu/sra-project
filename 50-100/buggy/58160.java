private void performActionUnread(java.util.ArrayList<com.sigmobile.dawebmail.database.EmailMessage> emailsMarkedForAction) {
    android.support.design.widget.Snackbar.make(swipeRefreshLayout, getString(R.string.snackbar_marking_unread), Snackbar.LENGTH_LONG).show();
    new com.sigmobile.dawebmail.asyncTasks.MultiMailAction(currentUser, getActivity(), this, emailsMarkedForAction, getString(R.string.msg_action_unread)).execute();
    setupDeleteAndComposeFABs(false);
    com.sigmobile.dawebmail.network.AnalyticsAPI.sendMultipleMailAction(AnalyticsAPI.ACTION_MARK_UNREAD, emailsMarkedForAction, getContext());
}