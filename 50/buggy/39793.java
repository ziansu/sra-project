@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    month = mMonthSpinner.getValue();
    mCurrentDate.set(java.util.Calendar.MONTH, month);
    updateDateControl();
    onDateTimeChanged();
}