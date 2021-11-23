public void setIntent(android.content.Intent newIntent) {
    if (newIntent.hasExtra("uri")) {
        newIntent.setData(android.net.Uri.parse(newIntent.getStringExtra("uri")));
        newIntent.removeExtra("uri");
    }
    super.setIntent(newIntent);
    super.setIntegerProperty("loadUrlTimeoutValue", 120000);
    super.setBooleanProperty("keepRunning", true);
}