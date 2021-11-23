public void inGameLoop(char[][] tabMap) {
    while (gameRunning) {
        this.newMap = entities.Player.move(1, tabMap);
        this.map = this.newMap;
        window.UpdateMap(map);
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException ex) {
            java.lang.Thread.currentThread().interrupt();
        }
    } 
}