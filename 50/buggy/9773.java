@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    connection.close();
    unregisterReceiver(btReceiver);
}