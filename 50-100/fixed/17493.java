@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    com.transitangel.transitangel.schedule.FilterDialogFragment.calendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    com.transitangel.transitangel.schedule.FilterDialogFragment.calendar.set(java.util.Calendar.MINUTE, minute);
    mSelectedTime.setText(mTimeFormat.format(com.transitangel.transitangel.schedule.FilterDialogFragment.calendar.getTime()));
    mLayoutTime.setContentDescription((("Selected time " + (mTimeFormat.format(com.transitangel.transitangel.schedule.FilterDialogFragment.calendar.getTime()))) + "Tap to change"));
}