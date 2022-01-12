private void initGame(java.lang.String label) {
    if ((label.length()) > 3) {
        running = true;
        OskMain.CURRENT_LABEL = label;
    }else {
        running = false;
        promptPrint("");
        setWaitingForBoolean(false);
        OskMain.CURRENT_LABEL = "What would you like to play next?";
    }
    doEnabling();
    playMusic();
}