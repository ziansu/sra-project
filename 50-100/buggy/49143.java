private void setParameters(android.widget.CalendarView cal, android.widget.TimePicker start, android.widget.TimePicker end) {
    startTime = getTime(start);
    endTime = getTime(end);
    capacity = java.lang.Integer.parseInt(capText.getText().toString());
    location = locText.getText().toString();
}