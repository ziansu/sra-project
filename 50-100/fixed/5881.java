@java.lang.Override
public void onChangeDay(java.lang.Integer dayPosition) {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if ((((selectedDayPosition) != null) && (dayPosition != null)) && ((dayPosition + 1) != (selectedDayPosition))) {
        if ((actionBar != null) && ((actionBar.getNavigationMode()) == (android.support.v7.app.ActionBar.NAVIGATION_MODE_LIST))) {
            changedDayFromViewPager = true;
            selectedDayPosition = dayPosition + 1;
            actionBar.setSelectedNavigationItem((dayPosition + 1));
        }
    }
}