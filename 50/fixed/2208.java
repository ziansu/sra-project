private com.badlogic.gdx.scenes.scene2d.ui.Image createStaticTexture(java.lang.String texturePath, int x, int y) {
    com.badlogic.gdx.scenes.scene2d.ui.Image img = new com.badlogic.gdx.scenes.scene2d.ui.Image(com.tdt4240grp8.game.managers.TextureManager.getInstance().getTexture(texturePath));
    img.setPosition(x, y);
    return img;
}