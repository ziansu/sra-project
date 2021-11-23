@java.lang.Override
public void draw(java.awt.Graphics g, int x, int y, int object) {
    switch (object) {
        case BuildingModel.GARB :
            drawGarb(g, x, y);
            break;
        case BuildingModel.STATION :
            drawStation(g, x, y);
            break;
    }
    repaint();
}