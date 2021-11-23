@java.lang.Override
public void onDateChanged(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    this.calendar = new java.util.GregorianCalendar(year, monthOfYear, dayOfMonth);
    yr = calendar.get(java.util.Calendar.YEAR);
    mth = (calendar.get(java.util.Calendar.MONTH)) + 1;
    day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    selectedDate = new java.util.GregorianCalendar(yr, mth, day);
}