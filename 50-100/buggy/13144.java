@java.lang.Override
public void onTextureRegionChanged(com.badlogic.gdx.graphics.g2d.TextureRegion oldTextureRegion, com.badlogic.gdx.graphics.g2d.TextureRegion newTextureRegion) {
    float newX = positionComponent.getX();
    float newY = positionComponent.getY();
    textureLighting.setPosition((newX + (offsetX)), (newY + (offsetY)));
    java.lang.System.out.println(((("new light X: " + (textureLighting.getX())) + ", ") + (textureLighting.getY())));
}