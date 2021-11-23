@java.lang.Override
protected void onPause() {
    if ((client) != null)
        client.stop();
    
    super.onPause();
}