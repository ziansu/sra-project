private void playSound(java.lang.String file) {
    try {
        java.io.InputStream is = new java.io.FileInputStream(file);
        java.lang.System.out.println(file);
        sun.audio.AudioStream audioStream = new sun.audio.AudioStream(is);
        sun.audio.AudioPlayer.player.start(audioStream);
    } catch (java.lang.Exception e) {
        com.twitchbotx.bot.CommandHandler.LOGGER.severe(e.toString());
    }
}