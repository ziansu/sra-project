@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    messagingConnectionService.removeConnectionListener(this);
}