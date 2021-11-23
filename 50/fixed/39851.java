public static final void sendEvent(android.support.v4.app.Fragment fragment, java.lang.String category, java.lang.String action) {
    if (fragment != null) {
        wb.receipts.analytics.Events.sendEvent(fragment.getActivity(), category, action);
    }
}