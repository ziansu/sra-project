void up(android.view.MotionEvent event) {
    if ((controller) != null) {
        int index = event.getActionIndex();
        int id = event.getPointerId(index);
        controller.removePoint(id);
    }
}