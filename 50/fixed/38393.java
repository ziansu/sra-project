@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    adapter.filter(viewPager.getCurrentItem(), query);
    appbar.setExpanded(true);
    return true;
}