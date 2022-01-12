@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    int source = event.getSource();
    if ((android.view.InputDevice.SOURCE_MOUSE) == (source & (android.view.InputDevice.SOURCE_MOUSE))) {
        handleMouseEvent(event);
    }else
        if ((android.view.InputDevice.SOURCE_TOUCHSCREEN) == (source & (android.view.InputDevice.SOURCE_TOUCHSCREEN))) {
            handleTouchEvent(event);
        }
    
    return true;
}