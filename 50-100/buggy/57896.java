private void makeStartPage() {
    currentPage = getPage(0);
    android.support.v4.app.FragmentManager mgr = getSupportFragmentManager();
    mgr.beginTransaction().replace(R.id.content_frame, currentPage).commit();
    mgr.executePendingTransactions();
    setTitle(getPageTitle(0));
    appTitle = getPageTitle(0).toString();
    invalidateOptionsMenu();
    ActivityLog.logListener = ((com.ajovanov.tidyfiles.StartPageFragment) (currentPage));
}