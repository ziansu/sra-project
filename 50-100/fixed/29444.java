public void newGameSetup() {
    setMyTurn(false);
    resetRolled();
    resetCounters();
    resetReady();
    GameGUI.enableNewGameMenu();
    if (((inputStream) != null) && ((outputStream) != null)) {
        try {
            inputStream.close();
            outputStream.close();
        } catch (java.io.IOException ex) {
        }
    }
    shutdownThread();
}