@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_MOVE :
            java.lang.System.out.println("szw move()  -- normal");
            x = ((int) (event.getX()));
            y = ((int) (event.getY()));
            invalidate();
            break;
    }
    return true;
}