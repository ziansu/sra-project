@java.lang.Override
public void onSelectedDayChange(android.widget.CalendarView view, int year, int month, int dayOfMonth) {
    this.month = month + 1;
    this.day = dayOfMonth;
    java.lang.String date = ((month + 1) + "/") + dayOfMonth;
    fetchData(date);
    dialog.dismiss();
}