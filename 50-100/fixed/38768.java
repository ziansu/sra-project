public void onDeviceDisconnected() {
    if ((mTimer) != null) {
        mTimer.cancel();
        mTimer = null;
    }
    if ((textStatus) != null) {
        textStatus.setText("Status : Not connect");
        menu.clear();
        getMenuInflater().inflate(R.menu.menu_connection, menu);
    }
}