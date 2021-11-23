public void drawAssortedScenery(java.awt.Graphics g) {
    drawPlayerShadow(g, Player.xPoint, Player.yPoint, Player.shadowExpand);
    for (int i = 0; i < (assortedScenery.size()); i++) {
        assortedScenery.get(i).draw(g);
    }
}