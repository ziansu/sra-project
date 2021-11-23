@java.lang.Override
public void onPause() {
    super.onPause();
    mTimer.cancel();
    mDatasource.close();
}