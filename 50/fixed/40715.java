@java.lang.Override
public void onDateClicked(int year, int month, int dayOfMonth) {
    dateRangeManager.setDateRangeForDate(year, month, dayOfMonth, true);
    viewPager.setCurrentItem(0, true);
}