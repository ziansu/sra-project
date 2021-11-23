@java.lang.Override
public void onStop() {
    super.onStop();
    client.removeStateListener(stateListener);
    client.disconnect();
}