@java.lang.Override
public void matchStart() {
    eisbw.BWAPIBridge.logger.info("Game started...");
    eisbw.BWAPIBridge.bwapi.setGameSpeed(5);
    eisbw.BWAPIBridge.bwapi.enableUserInput();
    eisbw.BWAPIBridge.bwapi.drawIDs(true);
    eisbw.BWAPIBridge.bwapi.drawHealth(true);
    eisbw.BWAPIBridge.bwapi.drawTargets(true);
    mapPercepts = new java.util.ArrayList<>();
    gameStarted = true;
}