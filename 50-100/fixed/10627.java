@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    switch (motionEvent.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            password.setTransformationMethod(null);
            return true;
        case android.view.MotionEvent.ACTION_UP :
            password.setTransformationMethod(new android.text.method.PasswordTransformationMethod());
            return false;
        default :
            return false;
    }
}