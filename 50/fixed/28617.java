@java.lang.Override
public boolean onNavigationItemSelected(int itemPosition, long l) {
    examScheduleFragment.updateSchedule(itemPosition);
    selectedDayPosition = itemPosition;
    return false;
}