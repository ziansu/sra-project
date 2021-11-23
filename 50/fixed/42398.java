@java.lang.Override
public void onDestroy() {
    mIds.clear();
    unregisterSensor();
    super.onDestroy();
}