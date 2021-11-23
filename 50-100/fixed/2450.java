@java.lang.Override
public void onReceive(se.jakobkrantz.transit.app.reporting.fragments.Context context, se.jakobkrantz.transit.app.reporting.fragments.Intent intent) {
    java.lang.String action = intent.getStringExtra(GcmConstants.ACTION);
    if (action.equals(GcmConstants.ACTION_REGISTER_SUCCESSFUL)) {
        final se.jakobkrantz.transit.app.reporting.fragments.SharedPreferences prefs = getGcmPreferences(context);
        se.jakobkrantz.transit.app.reporting.fragments.SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(se.jakobkrantz.transit.app.reporting.fragments.ReportFragment.REGISTRATION_SUCCESSFUL, true);
        editor.commit();
    }else
        if (action.equals(GcmConstants.ACTION_ACK)) {
            ackReceived = true;
        }
    
}