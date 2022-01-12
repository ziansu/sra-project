@java.lang.Override
public void renderShapes(com.badlogic.gdx.graphics.glutils.ShapeRenderer sr) {
    if (Gdx.input.isKeyJustPressed(Keys.P)) {
        rayEnabled = !(rayEnabled);
    }
    if (rayEnabled) {
        sr.setColor(Color.RED);
        sr.line(p1.scl(GameState.PPM), p2.scl(GameState.PPM));
    }
}