public void update(float deltaTime) {
    this.position.add(this.velocity.cpy().scl(deltaTime));
    updateBoundingBox();
    applyGravity(deltaTime);
}