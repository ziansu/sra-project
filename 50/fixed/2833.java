@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((server) != null) {
        server.exit();
    }
}