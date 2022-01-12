private void stopBot() {
    if (!(dankChannelBot.isSilentJoinLeave())) {
        dankChannelBot.channelMessage("/me leaving MrDestructoid");
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
    dankChannelBot.disconnect();
    dankChannelBot.dispose();
    dankWhisperBot.disconnect();
    dankWhisperBot.dispose();
    java.lang.System.exit(0);
}