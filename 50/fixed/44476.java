@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(myGoogleClient.isConnected())) {
        myGoogleClient.connect();
    }
}