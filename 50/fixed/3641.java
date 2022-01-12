@java.lang.Override
public void run() {
    if ((connectState) == (org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.CONNECT_STATE_CONNECTED)) {
        webSocket.ping("ping");
        handler.postDelayed(this, org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.KEEPALIVE_SPAN);
    }
}