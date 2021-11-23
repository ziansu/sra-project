public void changeToBattle(engine.Formation formation) {
    if (((currentScene) != null) && ((currentMap) == null))
        currentScene.stop();
    
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
    }
    currentScene = battle;
    battle.start(formation);
}