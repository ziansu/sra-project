@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        v.setPressed((!(v.isPressed())));
        java.lang.System.out.println("DOWN!!!");
    }
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_CANCEL)) {
        v.setPressed((!(v.isPressed())));
    }
    return true;
}