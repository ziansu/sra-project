@java.lang.Override
public void run() {
    webSocket.ping("ping");
    if ((connectState) == (org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.CONNECT_STATE_CONNECTED)) {
        handler.postDelayed(this, org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.KEEPALIVE_SPAN);
    }
}