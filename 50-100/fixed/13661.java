@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    org.joda.time.DateTime dateTime = new org.joda.time.DateTime(year, (monthOfYear + 1), dayOfMonth, 0, 0);
    tournamentDateEditText.setText(dateFormatter.format(dateTime.toDate()));
}