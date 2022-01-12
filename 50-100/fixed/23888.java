public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    com.mtautumn.edgequest.EdgeQuest.characterManager.start();
    com.mtautumn.edgequest.EdgeQuest.terrainManager.start();
    com.mtautumn.edgequest.EdgeQuest.rendererManager.start();
    com.mtautumn.edgequest.EdgeQuest.gameClock.start();
    com.mtautumn.edgequest.EdgeQuest.animationClock.start();
    com.mtautumn.edgequest.EdgeQuest.blockUpdateManager.start();
    com.mtautumn.edgequest.EdgeQuest.autoCharacterWalk.start();
    while (true) {
        java.lang.Thread.sleep(10000);
    } 
}