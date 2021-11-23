@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent motionEvent) {
    final int eventAction = motionEvent.getAction();
    switch (eventAction) {
        case android.view.MotionEvent.ACTION_DOWN :
            {
                break;
            }
        case android.view.MotionEvent.ACTION_MOVE :
            {
                assignShapeId(v);
                onDraggingShape(motionEvent);
                break;
            }
        case android.view.MotionEvent.ACTION_UP :
            {
                mShapeId = -1;
                break;
            }
    }
    return true;
}