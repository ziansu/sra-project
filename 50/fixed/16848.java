@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_calendar_filters :
            startCalendarFiltersScreen();
            return true;
        case R.id.action_request_time_off :
            startRequestTimeOffScreen();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}