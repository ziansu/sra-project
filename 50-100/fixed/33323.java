public void touchMove(float x, float y) {
    if ((distance(startX, pivotX, startY, pivotY)) > (distance(x, pivotX, y, pivotY))) {
        push = true;
    }else {
        push = false;
    }
    this.startX = x;
    this.startY = y;
}