@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            keyStatus.select = true;
            nesView.updateKey(0, keyStatus.getCode());
            break;
        case android.view.MotionEvent.ACTION_UP :
        case android.view.MotionEvent.ACTION_CANCEL :
            keyStatus.select = false;
            nesView.updateKey(0, keyStatus.getCode());
            break;
    }
    return true;
}