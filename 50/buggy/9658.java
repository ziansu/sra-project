@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    offsetTiles();
    updateFogOfWar();
    renderTiles(g);
    hud.updateHUD(g);
    observedNPC.updateObservation(g);
}