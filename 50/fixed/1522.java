@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mEventDay = dayOfMonth;
    mEventMonth = monthOfYear + 1;
    mEventYear = year;
}