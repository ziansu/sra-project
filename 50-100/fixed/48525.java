public void setMoveDirection(float x, float y) {
    this.moveDirection.set(x, y);
    if ((x == 0) && (y == 0)) {
        this.isMoving = false;
    }else {
        this.moveDirection.nor();
        this.isMoving = true;
    }
}