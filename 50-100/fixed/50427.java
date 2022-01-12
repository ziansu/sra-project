@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    updateDateRange(dtRangeIdx, new org.joda.time.DateTime(datePicker.getYear(), ((datePicker.getMonth()) + 1), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute(), 0, 0));
}