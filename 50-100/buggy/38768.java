public void onDeviceDisconnected() {
    if ((mTimer) != null) {
        mTimer.cancel();
        mTimer = null;
    }
    android.widget.Button textStatus = ((android.widget.Button) (findViewById(R.id.btn_send)));
    if (textStatus != null) {
        textStatus.setText("Status : Not connect");
        menu.clear();
        getMenuInflater().inflate(R.menu.menu_connection, menu);
    }
}