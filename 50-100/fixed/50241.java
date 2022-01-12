void down(android.view.MotionEvent event) {
    if ((controller) != null) {
        int index = event.getActionIndex();
        int id = event.getPointerId(index);
        android.graphics.PointF p = new android.graphics.PointF(event.getX(index), event.getY(index));
        controller.addPoint(id, norm(p));
    }
}