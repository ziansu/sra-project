public void jump(float deltaTime) {
    jumpingComponent.jump(deltaTime);
    if (tiledCollisionComponent.isTopColliding()) {
        actionState = ActionState.FALLING;
    }
}