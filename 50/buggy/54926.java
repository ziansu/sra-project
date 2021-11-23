@java.lang.Override
public void onEventDeleted() {
    deleteProgressBar.dismiss();
    initializeDateViewPager();
    updateCalendarViewPager();
    previousView = null;
    dateViewPager.setCurrentItem(((selectedDay) - 1));
}