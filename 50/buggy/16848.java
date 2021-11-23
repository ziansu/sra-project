@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_calendar_filters :
            startCalendarFiltersScreen();
            break;
        case R.id.action_request_time_off :
            startRequestTimeOffScreen();
            break;
    }
    return super.onOptionsItemSelected(item);
}