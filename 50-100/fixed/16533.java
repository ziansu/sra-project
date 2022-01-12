@java.lang.Override
public void onTimeSet(com.wdullaer.materialdatetimepicker.time.RadialPickerLayout view, int hourOfDay, int minute, int second) {
    java.lang.String time = ((java.lang.String.format("%02d", hourOfDay)) + ":") + (java.lang.String.format("%02d", minute));
    android.util.Log.w(this.getLocalClassName(), ("You picked the following time: " + time));
    getAttributeFragment().updateAttributeValue(4, time);
    this.time = time;
}