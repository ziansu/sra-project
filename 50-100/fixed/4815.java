@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent e) {
    switch (e.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            btn_showHide.setPressed(true);
            txt_title.setPressed(true);
            break;
        case android.view.MotionEvent.ACTION_UP :
            btn_showHide.setPressed(false);
            txt_title.setPressed(false);
            touchAction();
            break;
    }
    return false;
}