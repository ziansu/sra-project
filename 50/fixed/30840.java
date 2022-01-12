@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if ((intent.getAction()) != null) {
        if (intent.getAction().equals(Intent.ACTION_MAIN)) {
            resetState();
        }
    }
}