@java.lang.Override
public void render(de.bitbrain.braingdx.world.GameObject object, com.badlogic.gdx.graphics.g2d.Batch batch, float delta) {
    if ((texture) == null) {
        buildTextureBuffer(batch);
    }
    sprite.setFlip(true, false);
    sprite.setPosition(object.getLeft(), ((object.getTop()) - ((cellOffset) * 2)));
    sprite.draw(batch);
}