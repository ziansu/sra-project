@java.lang.Override
public void onConnect(org.pircbotx.hooks.events.ConnectEvent event) throws java.lang.Exception {
    channels.forEach(( s) -> {
        event.getBot().sendIRC().joinChannel(s);
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    });
    super.onConnect(event);
}