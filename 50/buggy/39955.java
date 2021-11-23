@java.lang.Override
public void onStop() {
    super.onStop();
    alarm.cancelAlarm(getActivity());
}