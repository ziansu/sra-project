@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.util.ArrayList<playerEntity.Tile> tiles = bp.getTiles();
    int counter = 0;
    for (playerEntity.Tile t : tiles) {
        paintTile(g, t, (counter * (playerBoundary.BullpenView.CELL_WIDTH)), 0, playerBoundary.BullpenView.CELL_WIDTH, playerBoundary.BullpenView.CELL_WIDTH);
        g.setColor(java.awt.Color.BLACK);
        g.drawLine((counter * (playerBoundary.BullpenView.CELL_WIDTH)), 0, (counter * (playerBoundary.BullpenView.CELL_WIDTH)), playerBoundary.BullpenView.CELL_WIDTH);
        counter++;
    }
}