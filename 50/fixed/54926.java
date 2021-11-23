@java.lang.Override
public void onEventDeleted() {
    deleteProgressBar.dismiss();
    initializeDateViewPager();
    updateCalendarViewPager();
    dateViewPager.setCurrentItem(((selectedDay) - 1));
}