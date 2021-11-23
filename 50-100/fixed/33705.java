public void update() {
    tileGrid.update();
    if (!(complete)) {
        waveManager.update();
        player.update();
        hudGUI.update();
    }else
        if ((levelClearedGUI) != null)
            levelClearedGUI.update();
        
    
}