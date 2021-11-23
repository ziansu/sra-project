public void update() {
    tileGrid.update();
    if (!(complete)) {
        hudGUI.update();
        waveManager.update();
        player.update();
    }else
        if ((levelClearedGUI) != null)
            levelClearedGUI.update();
        
    
}