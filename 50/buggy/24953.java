@java.lang.Override
protected java.lang.Void doInBackground(fr.wildcodeschool.haa.waxym.CalendarFragment... params) {
    leftCalendarFragment.updateCalendar(getApplicationContext());
    rightCalendarFragment.updateCalendar(getApplicationContext());
    return null;
}