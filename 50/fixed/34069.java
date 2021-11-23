public void update(float deltaTime) {
    applyGravity(deltaTime);
    this.position.add(this.velocity.cpy().scl(deltaTime));
    updateBoundingBox();
}