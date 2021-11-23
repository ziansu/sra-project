protected void scan(android.view.View v) {
    wlist.clear();
    wifimanager.startScan();
    myadapter.notifyDataSetChanged();
}