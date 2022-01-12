public void run() {
    try {
        (nStep)++;
        l.setPlayer(gameStates.get(nStep).getpArr());
        gui.notify(false, gameStates.get(nStep).getId());
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.Exception e) {
        }
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
}