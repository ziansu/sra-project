public void respawn(com.badlogic.gdx.math.Vector2 pos) {
    createBody();
    this.body.setTransform(pos, 0.0F);
    pc.setBody(this.body);
    this.hp = 100;
}