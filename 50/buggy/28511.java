@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    dayOfMonth = mDaySpinner.getValue();
    mCurrentDate.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
    onDateTimeChanged();
}