public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    if (this.moving) {
        time += Gdx.graphics.getDeltaTime();
        updatePos(Gdx.graphics.getDeltaTime());
        if (this.moving) {
            this.view.updateWalkingAnimation(this.currentDirection);
        }
    }
    if (this.shooting) {
    }
    this.view.render(batch, time);
}