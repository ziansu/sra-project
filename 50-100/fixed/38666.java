@java.lang.Override
public void onDateSetSuccess(java.util.Date date) {
    ((com.lftechnology.khop.khop.fragment.TimePickerFragment) (mTimePicker)).setCustomTimeSetListener(this);
    mNotificationDate = date;
    if ((mTimePicker) == null) {
        mTimePicker = new com.lftechnology.khop.khop.fragment.TimePickerFragment();
    }
    mTimePicker.show(mFragmentManager, mTag);
}