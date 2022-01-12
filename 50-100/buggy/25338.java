private void handlePendingTouchEvents(android.graphics.Canvas canvas) {
    for (android.view.MotionEvent event : touchEvents) {
        event.offsetLocation(0, (-25));
        showTouch(event, canvas);
        int action = event.getAction();
        switch (action) {
            case android.view.MotionEvent.ACTION_DOWN :
                handleTouchDown(event);
                break;
            case android.view.MotionEvent.ACTION_MOVE :
                handleTouchMove(event);
                break;
            case android.view.MotionEvent.ACTION_UP :
                handleTouchUp(event);
                break;
        }
    }
    this.touchEvents.clear();
}