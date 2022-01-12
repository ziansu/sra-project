public void stopThread() {
    java.lang.System.out.println(("Stopping: " + (getText())));
    player.closeStream();
    loadFile();
    setBackground(backgroundDefault);
}