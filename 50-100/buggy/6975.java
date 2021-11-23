@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(mNavigationDrawerFragment.isDrawerOpen())) {
        switch (internal_layout) {
            case LAYOUT_LIST :
            case LAYOUT_SEARCH :
                getMenuInflater().inflate(R.menu.main, menu);
                break;
            case LAYOUT_TRACKING :
            case LAYOUT_ABOUT :
            default :
                getMenuInflater().inflate(R.menu.main_reduced, menu);
                break;
        }
        restoreActionBar();
        return true;
    }
    return super.onCreateOptionsMenu(menu);
}