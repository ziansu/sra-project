public void stopThread() {
    java.lang.System.out.println(("Stopping: " + (getText())));
    player.closeStream();
    player = null;
    loadFile();
    setBackground(backgroundDefault);
}