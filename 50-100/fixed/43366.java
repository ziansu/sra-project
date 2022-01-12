public void stop() {
    paused = true;
    if ((xdcc) != null) {
        xdcc.close();
        xdcc = null;
    }
    totalBot = 0;
    loadingBotList = 0;
    botResponse = -1;
    downloading = false;
    sourcesBot.clear();
    totalBot = 0;
    it.giara.sql.SQLQuerySettings.setStatus(filename, 1);
}