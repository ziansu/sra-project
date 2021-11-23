private java.lang.String getCustomerId(android.content.Context context) {
    final android.content.SharedPreferences prefs = getSharedPreferences(context);
    java.lang.String customerId = prefs.getString(rms.fyp.rmsphone.ViewTicket.PROPERTY_CUSTOMER_ID, "");
    if (customerId.isEmpty()) {
        android.util.Log.wtf(this.getClass().toString(), "customer id not found.");
        return "";
    }
    return customerId;
}