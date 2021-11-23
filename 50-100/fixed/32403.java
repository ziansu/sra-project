public void setSprite(java.lang.String name, int height, int width) {
    setTexture(manager.get(name, com.badlogic.gdx.graphics.Texture.class));
    setBounds(body.getPosition().x, body.getPosition().y, (height / (se.boregrim.gyarb.utils.Constants.PPM)), (width / (se.boregrim.gyarb.utils.Constants.PPM)));
    java.lang.System.out.println("hej");
}