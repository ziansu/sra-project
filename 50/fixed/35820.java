@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mCalendar.set(java.util.Calendar.YEAR, year);
    mCalendar.set(java.util.Calendar.MONTH, monthOfYear);
    mCalendar.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
    updateDate(mCalendar);
}