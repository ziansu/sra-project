@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... message) {
    java.lang.String address = null;
    try {
        com.danielhstahl.plugin.avreceiver.onkyo.helpers.EiscpConnector conn = com.danielhstahl.plugin.avreceiver.onkyo.helpers.EiscpConnector.autodiscover();
        address = conn.getAddress();
        java.lang.System.out.println("address gotten");
        conn.close();
    } catch (java.lang.Exception e) {
        tv.yatse.plugin.avreceiver.api.YatseLogger.getInstance(getApplicationContext()).logError(com.danielhstahl.plugin.avreceiver.onkyo.SettingsActivity.TAG, "Error when scanning: %s", e);
    }
    return address;
}