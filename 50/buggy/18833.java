public void changeToCreation() {
    if ((currentScene) != null)
        currentScene.stop();
    
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
    }
    creation.start();
    currentScene = creation;
}