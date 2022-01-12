@java.lang.Override
public boolean onTouchEvent(@android.support.annotation.NonNull
android.view.MotionEvent event) {
    float touchX = event.getX();
    float touchY = event.getY();
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            path.moveTo(touchX, touchY);
            break;
        case android.view.MotionEvent.ACTION_MOVE :
            path.lineTo(touchX, touchY);
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