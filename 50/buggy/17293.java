public void setDragToRotate(boolean dragToRotate) {
    this.dragToRotate = dragToRotate;
    this.canRotate = !dragToRotate;
    inputManager.setCursorVisible(dragToRotate);
}