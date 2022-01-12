public void newGameSetup() {
    setMyTurn(false);
    resetRolled();
    resetCounters();
    resetReady();
    GameGUI.enableNewGameMenu();
    try {
        inputStream.close();
        outputStream.close();
    } catch (java.io.IOException ex) {
    }
    shutdownThread();
}