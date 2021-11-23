@java.lang.Override
public void onDateSet(final com.fourmob.datetimepicker.date.DatePickerDialog parDatePickerDialog, final int year, final int month, final int day) {
    mEndDate = new java.util.GregorianCalendar(year, month, day);
    mEndDateTV.setText(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT).format(mStartDate.getTime()));
}