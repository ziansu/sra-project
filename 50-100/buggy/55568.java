@java.lang.Override
public void run() {
    if ((liveOkeUDPClient) != null) {
        if (liveOkeUDPClient.doneGettingSongList) {
            toggleOff();
            java.lang.String ip = com.vnguyen.liveokeremote.helper.PreferencesHelper.getInstance(this).getPreference("ipAddress");
            if (((liveOkeUDPClient.pingCount) > 5) && ((ip == null) || (ip.equals("")))) {
                liveOkeUDPClient.liveOkeIPAddress = null;
            }
            liveOkeUDPClient.sendMessage("Ping", liveOkeUDPClient.liveOkeIPAddress, LiveOkeUDPClient.LIVEOKE_UDP_PORT);
            (liveOkeUDPClient.pingCount)++;
        }
    }
    handler.postDelayed(this, 10000);
}