public void update(java.awt.Point mousePosition) {
    for (controller.MovableObjectController movableObjectController : movableObjectControllers) {
        movableObjectController.update(mousePosition);
    }
    java.lang.System.out.println(dish.playerBacteria().level());
}