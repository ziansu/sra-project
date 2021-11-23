@java.lang.Override
public void paint(java.awt.Graphics graphics) {
    super.paint(graphics);
    area.drawBoard(graphics);
    hub.drawHub(graphics);
    hero.draw(graphics);
    drawMonsters(graphics);
}