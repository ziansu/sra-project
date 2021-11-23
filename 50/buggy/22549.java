@java.lang.Override
public void onDestroy() {
    messagingConnectionService.removeConnectionListener(this);
}