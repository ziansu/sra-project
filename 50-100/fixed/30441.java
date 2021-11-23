@butterknife.OnPageChange(value = R.id.fragment_pager)
void onPageSelected(int position) {
    switch (position) {
        case us.v4lk.transrock.util.SmartViewPager.MAP_PAGE :
            pager.setAllowSwiping(false);
            drawer.setSelection(position);
            break;
        case us.v4lk.transrock.util.SmartViewPager.ROUTE_PAGE :
            pager.setAllowSwiping(true);
            drawer.setSelection(position);
            break;
    }
}