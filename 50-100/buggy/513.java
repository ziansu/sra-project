public void update(float delta) {
    player.update();
    com.badlogic.gdx.math.Vector2 pos = player.getBody().getPosition();
    camera.position.x = (pos.x) * (MainClass.PIXELSINMETER);
    camera.update();
    world.step(delta, 10, 10);
}