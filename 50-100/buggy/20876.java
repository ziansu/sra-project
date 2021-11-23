private void emit(java.lang.String message) {
    br.com.pilovieira.tk303g.persist.Prefs prefs = new br.com.pilovieira.tk303g.persist.Prefs(context);
    if (prefs.getTrackerNumber().isEmpty())
        throw new java.lang.RuntimeException(context.getString(R.string.msg_configure_tracker_number));
    
    if (prefs.getPassword().isEmpty())
        throw new java.lang.RuntimeException(context.getString(R.string.msg_configure_password));
    
    android.telephony.SmsManager.getDefault().sendTextMessage(prefs.getTrackerNumber(), null, message, null, null);
}