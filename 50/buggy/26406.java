@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    for (java.lang.Class c : us.michaelchen.compasslogger.receiver.PeriodicReceiver.PERIODICS) {
        context.startService(new android.content.Intent(context, c));
    }
    us.michaelchen.compasslogger.utils.PreferencesWrapper.updateLastAlarmTimestamp();
}