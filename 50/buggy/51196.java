@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    boolean keep = intent.getExtras().getBoolean("keep");
    if (!keep) {
        finish();
    }
    setView(intent);
}