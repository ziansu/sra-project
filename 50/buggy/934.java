private void stopPlayingPlayList() {
    sendCommand("echo stop > fifofile");
    es.shutdownNow();
    sendCommand("rm fifofile");
}