@java.lang.Override
public void render(java.awt.Graphics g) {
    g.drawImage(com.townrpg.core.tile.Tiles.getSprites().crop(0, 0, 0, 0), ((int) (x)), ((int) (y)), null);
}