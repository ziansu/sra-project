@java.lang.Override
public void onResume() {
    super.onResume();
    unbindService(connection);
    service = null;
}