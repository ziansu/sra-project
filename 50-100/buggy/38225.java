@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.v(ca.rmen.android.frcwidget.FRCWidgetScheduler.TAG, ("onReceive: intent = " + intent));
    if (Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {
        int frequency = ca.rmen.android.frccommon.prefs.FRCPreferences.getInstance(context).getUpdateFrequency();
        if (frequency < (ca.rmen.android.frccommon.prefs.FRCPreferences.FREQUENCY_DAYS)) {
            cancel();
        }
    }else
        if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {
            schedule();
        }
    
}