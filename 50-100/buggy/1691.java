@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((org.hisp.dhis.android.eventcapture.EventCaptureApp) (getApplication())).getUserComponent().inject(this);
    addMenuItem(org.hisp.dhis.android.eventcapture.views.activities.HomeActivity.DRAWER_ITEM_EVENTS_ID, R.drawable.ic_add, R.string.drawer_item_events);
    onNavigationItemSelected(getNavigationView().getMenu().findItem(org.hisp.dhis.android.eventcapture.views.activities.HomeActivity.DRAWER_ITEM_EVENTS_ID));
}