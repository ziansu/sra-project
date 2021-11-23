@java.lang.Override
public void onDateChanged(final android.widget.DatePicker view, final int year, final int monthOfYear, final int dayOfMonth) {
    java.util.Calendar newDate = java.util.Calendar.getInstance();
    newDate.set(year, (monthOfYear + 1), dayOfMonth);
    java.lang.String updatedDateSting = ((((monthOfYear + 1) + "/ ") + dayOfMonth) + "/ ") + year;
    toDoSelectedDayTextView.setText(updatedDateSting);
}