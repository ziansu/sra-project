@java.lang.Override
public void onBackPressed() {
    if (((resultDrawer) != null) && (resultDrawer.isDrawerOpen())) {
        resultDrawer.closeDrawer();
    }else {
        if ((lastUsedFragment) instanceof com.alorma.github.ui.fragment.events.EventsListFragment) {
            finish();
        }else
            if (((resultDrawer) != null) && (((lastUsedFragment) instanceof com.alorma.github.ui.fragment.repos.GeneralReposFragment) || ((lastUsedFragment) instanceof com.alorma.github.ui.fragment.GeneralPeopleFragment))) {
                resultDrawer.setSelection(R.id.nav_drawer_events);
            }
        
    }
}