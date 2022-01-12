public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    currentState = manager.getActiveGameState();
    if ((currentState) == null)
        return false;
    
    currentState.onTouchEvent(v, event);
    return true;
}