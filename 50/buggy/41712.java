public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    currentState = manager.getActiveGameState();
    currentState.onTouchEvent(v, event);
    return true;
}