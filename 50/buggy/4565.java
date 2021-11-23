@java.lang.Override
protected void onStart() {
    permissionCheck();
    super.onStart();
    if (!(connected)) {
        c.execute(usrName);
        connected = true;
    }
    mGoogleApiClient.connect();
}