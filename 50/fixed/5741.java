@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    adapter.filter(viewPager.getCurrentItem(), newText);
    appbar.setExpanded(true);
    return true;
}