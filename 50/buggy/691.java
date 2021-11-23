@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.hasExtra("state")) {
        changeShengDao(false);
    }
}