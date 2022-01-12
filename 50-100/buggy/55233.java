@java.lang.Override
protected com.danielhstahl.plugin.avreceiver.onkyo.helpers.EiscpConnector doInBackground(java.lang.String... message) {
    try {
        com.danielhstahl.plugin.avreceiver.onkyo.helpers.EiscpConnector conn = new com.danielhstahl.plugin.avreceiver.onkyo.helpers.EiscpConnector(threadedIP, java.lang.Integer.parseInt(threadedPort));
        conn.sendIscpCommand(message[0]);
        conn.close();
        java.lang.System.out.println("task tested");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
        tv.yatse.plugin.avreceiver.api.YatseLogger.getInstance(getApplicationContext()).logError(com.danielhstahl.plugin.avreceiver.onkyo.SettingsActivity.TAG, "Error when connecting: %s", e);
    }
    return null;
}