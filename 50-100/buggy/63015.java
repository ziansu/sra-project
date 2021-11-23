@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    dateAndTime.set(year, month, dayOfMonth);
    startDate = dateAndTime.getTime();
    dateAndTime = java.util.Calendar.getInstance();
    startTextView.setText(Record.DATE_FORMATTER.format(dateAndTime.getTime()));
}