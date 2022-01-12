@java.lang.Override
public void render(java.awt.Graphics g) {
    g.drawImage(com.townrpg.core.tile.Tiles.getSprites().crop(1, 1, 1, 1), ((int) (x)), ((int) (y)), null);
}