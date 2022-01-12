public com.dean.travltotibet.model.AbstractPoint handleTouchEvent(android.view.MotionEvent event) {
    float X = event.getX();
    float Y = event.getY();
    for (com.dean.travltotibet.model.AbstractPoint point : mPoints) {
        if (((point.getPointRect()) != null) && (point.getPointRect().contains(X, Y))) {
            return point;
        }
    }
    return null;
}