@java.lang.Override
public void run() {
    while (isVisible()) {
        doControlButtons(sonic.isAi());
        doRefreshComponents();
        try {
            java.lang.Thread.sleep(ConfigEngine.FPS.getValue());
        } catch (java.lang.InterruptedException ex) {
            throw new java.lang.RuntimeException(("Falha ao Interromper " + (ex.getMessage())));
        }
    } 
}