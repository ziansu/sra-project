@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent event) {
    if ((event.getX()) > ((getApplicationContext().getResources().getDisplayMetrics().widthPixels) / 2))
        controller.processEvent(TetrisController.InputEvent.ROTATE_LEFT);
    else
        controller.processEvent(TetrisController.InputEvent.ROTATE_RIGHT);
    
    return true;
}