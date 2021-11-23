@java.lang.Override
public void render(java.awt.Graphics g) {
    g.drawImage(Assets.player, ((int) ((x) - (handler.getGameCamera().getxOffset()))), ((int) ((y) - (handler.getGameCamera().getyOffset()))), null);
}