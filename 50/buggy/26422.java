void up(android.view.MotionEvent event) {
    int index = event.getActionIndex();
    int id = event.getPointerId(index);
    controller.removePoint(id);
}