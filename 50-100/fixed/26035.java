@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    switch (CalendarUtils.sWeekStart) {
        case java.util.Calendar.SATURDAY :
            menu.findItem(R.id.action_week_start_saturday).setChecked(true);
            break;
        case java.util.Calendar.SUNDAY :
            menu.findItem(R.id.action_week_start_sunday).setChecked(true);
            break;
        case java.util.Calendar.MONDAY :
            menu.findItem(R.id.action_week_start_monday).setChecked(true);
            break;
    }
    return super.onPrepareOptionsMenu(menu);
}