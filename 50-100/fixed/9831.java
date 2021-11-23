@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            this.x = event.getX();
            this.y = event.getY();
            return true;
        case android.view.MotionEvent.ACTION_UP :
            this.detectMovement(event.getX(), event.getY());
            return true;
        default :
            return false;
    }
}