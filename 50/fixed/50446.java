@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((fr.insapp.insapp.activities.MainActivity.customTabsConnection) != null) {
        this.unbindService(fr.insapp.insapp.activities.MainActivity.customTabsConnection);
        fr.insapp.insapp.activities.MainActivity.customTabsConnection = null;
    }
}