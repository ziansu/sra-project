public void setMoveDirection(float x, float y) {
    this.moveDirection.set(x, y);
    this.moveDirection.nor();
    if (((moveDirection.x) == 0) && ((moveDirection.y) == 0)) {
        this.isMoving = false;
    }else {
        this.isMoving = true;
    }
}