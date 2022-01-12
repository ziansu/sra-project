@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    switch (intent.getAction()) {
        case android.content.Intent.ACTION_POWER_CONNECTED :
            determineAndNotify(true);
            break;
        case android.content.Intent.ACTION_POWER_DISCONNECTED :
            determineAndNotify(false);
            break;
    }
}