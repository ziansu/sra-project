@java.lang.Override
public boolean onNavigationItemSelected(int itemPosition, long l) {
    examScheduleFragment.updateSchedule((itemPosition - 1));
    selectedDayPosition = itemPosition;
    return false;
}