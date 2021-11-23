public void shoot() {
    vertices = Spaceship.getTransformedVertices();
    if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
        vertices = Spaceship.getTransformedVertices();
        bullets.add(new Elements.Bullet(vertices[4], vertices[5], Spaceship.getRotation()));
        sparo.play(1.0F);
    }
    for (Elements.Bullet b : bullets) {
        b.loop();
    }
}