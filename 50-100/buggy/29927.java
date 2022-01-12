public void createTutorialTrap() {
    com.badlogic.gdx.math.Vector2 location = new com.badlogic.gdx.math.Vector2(((player.getBody().getPosition().x) - 40), player.getBody().getPosition().y);
    createTrap(new float[]{ location.x , location.y });
    player.getBody().setTransform(player.getBody().getPosition(), 3.1427F);
}