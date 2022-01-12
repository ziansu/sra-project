public void update(java.awt.Point mousePosition) {
    for (controller.MovableObjectController movableObjectController : movableObjectControllers) {
        movableObjectController.update(mousePosition);
    }
}