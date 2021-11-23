@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    timber.log.Timber.d("Action was DOWN");
    if ((viewWidth) == 0) {
        viewInitialX = view.getX();
        viewInitialY = view.getY();
        delButtonInitialX = delButton.getX();
        delButtonInitialY = delButton.getY();
        viewWidth = view.getWidth();
    }
    return true;
}