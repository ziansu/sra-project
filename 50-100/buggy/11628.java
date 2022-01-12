@java.lang.Override
public void run() {
    try {
        if (!(chatManager.getContacts().isEmpty())) {
            specialfilldatabase();
            updatevalues();
            adapter.refreshEvents(infochat, imgid);
        }else {
            android.widget.Toast.makeText(getActivity(), "No Contact now", Toast.LENGTH_SHORT).show();
        }
    } catch (java.lang.Exception e) {
        errorManager.reportUnexpectedSubAppException(SubApps.CHT_CHAT, UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
    }
    mSwipeRefreshLayout.setRefreshing(false);
}