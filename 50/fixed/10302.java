public void onMessageReceived(java.lang.String text) {
    mission.processResponse(text);
    if ((mission.getPrompt()) != null) {
        sender.send(mission.getPrompt());
    }
}