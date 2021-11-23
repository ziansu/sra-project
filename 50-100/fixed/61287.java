@java.lang.Override
protected void connectToHost(java.lang.String uniqueId, java.lang.String name, java.lang.String ip) {
    mHostUniqueId = uniqueId;
    mHostName = name;
    mHostIp = ip;
    mReceiverIP = com.danielhstahl.plugin.avreceiver.onkyo.helpers.PreferencesHelper.getInstance(getApplicationContext()).hostIp(mHostUniqueId);
    mReceiverPort = com.danielhstahl.plugin.avreceiver.onkyo.helpers.PreferencesHelper.getInstance(getApplicationContext()).hostPort(mHostUniqueId);
    new com.danielhstahl.plugin.avreceiver.onkyo.OnkyoPluginService.connectToReceiver().execute();
    tv.yatse.plugin.avreceiver.api.YatseLogger.getInstance(getApplicationContext()).logVerbose(com.danielhstahl.plugin.avreceiver.onkyo.OnkyoPluginService.TAG, "Connected to: %s / %s ", name, mHostUniqueId);
}