@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    long result = intent.getLongExtra("start timer", 0);
    settingTimer(result);
}