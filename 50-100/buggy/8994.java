private void onSetAlarmTime(android.view.View view) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt("set_hour", hour);
    bundle.putInt("set_minute", minute);
    concentric.medalarm.AlarmTimePickerDialogFragment timePickerDialogFragment = new concentric.medalarm.AlarmTimePickerDialogFragment();
    timePickerDialogFragment.setHandler(timePickerHandler);
    timePickerDialogFragment.setArguments(bundle);
    concentric.medalarm.activity.FragmentManager fragmentManager = getSupportFragmentManager();
    concentric.medalarm.activity.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(timePickerDialogFragment, "time_picker");
    fragmentTransaction.commit();
}