public boolean handleTouchEvent(android.view.MotionEvent event) {
    updateCurrentTouchPosition(event);
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            mWasMoved = false;
            initializeCircuitComponents();
            createCircuitConnection();
            break;
        case android.view.MotionEvent.ACTION_UP :
            if (mWasMoved) {
                mCurrentSelectedComponent = null;
            }
            break;
        case android.view.MotionEvent.ACTION_MOVE :
            moveCurrentComponent();
            mWasMoved = true;
            break;
        case android.view.MotionEvent.ACTION_CANCEL :
            mCurrentSelectedComponent = null;
            break;
    }
    return true;
}