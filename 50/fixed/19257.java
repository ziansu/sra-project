@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((this.getResources().getConfiguration().orientation) == 1) {
        startAlarm();
    }
}