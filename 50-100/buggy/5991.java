public void setVelocityDirection(float x, float y) {
    com.badlogic.gdx.math.Vector2 newVelocity = new com.badlogic.gdx.math.Vector2((x - (this.position.x)), (y - (this.position.y)));
    newVelocity.nor();
    newVelocity.scl(this.DEFAULT_VELOCITY);
    this.setVelocity(newVelocity.x, newVelocity.y);
    java.lang.System.out.println(((("vX: " + (newVelocity.x)) + " vY: ") + (newVelocity.y)));
}