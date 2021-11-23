@java.lang.Override
public void onDateSet(com.codetroopers.betterpickers.calendardatepicker.CalendarDatePickerDialogFragment dialog, int year, int monthOfYear, int dayOfMonth) {
    tvDate.setText(((((year + "-") + (monthOfYear + 1)) + "-") + dayOfMonth));
    android.util.Log.d("OnDateSet", ("Year == " + year));
    cal.set(year, monthOfYear, dayOfMonth);
}