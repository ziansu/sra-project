@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    int source = event.getSource();
    if (source == (android.view.InputDevice.SOURCE_MOUSE)) {
        handleMouseEvent(event);
    }else
        if (source == (android.view.InputDevice.SOURCE_TOUCHSCREEN)) {
            handleTouchEvent(event);
        }
    
    return true;
}