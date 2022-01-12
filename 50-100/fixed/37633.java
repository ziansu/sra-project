public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    dateAndTime.setTime(endDate);
    dateAndTime.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    dateAndTime.set(java.util.Calendar.MINUTE, minute);
    endDate = dateAndTime.getTime();
    endTimeTextView.setText(Record.DATE_FORMATTER.format(endDate.getTime()));
}