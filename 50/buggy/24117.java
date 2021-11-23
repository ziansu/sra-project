@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if (intent.getAction().equals(Intent.ACTION_MAIN)) {
        fadeDateTime(1, 300);
        resetState();
    }
}