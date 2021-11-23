@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    this.unbindService(fr.insapp.insapp.activities.MainActivity.customTabsConnection);
    fr.insapp.insapp.activities.MainActivity.customTabsConnection = null;
}