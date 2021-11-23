@java.lang.Override
public void onClick(android.view.View arg0) {
    mClearMapLimit = true;
    mPage = 0;
    refreshActiveFilters();
    loadObservations();
}