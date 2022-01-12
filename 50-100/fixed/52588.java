@java.lang.Override
public boolean onTouchEvent(@android.support.annotation.NonNull
android.view.MotionEvent event) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            path.moveTo(event.getX(), event.getY());
            break;
        case android.view.MotionEvent.ACTION_MOVE :
            path.lineTo(event.getX(), event.getY());
            break;
        case android.view.MotionEvent.ACTION_UP :
            canvas.drawPath(path, drawPaint);
            path.reset();
            break;
        default :
            return false;
    }
    invalidate();
    return true;
}