@java.lang.Override
protected void onStart() {
    initPlayServices();
    client.connect();
    super.onStart();
}