@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
        isTouch = false;
    }else
        if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
            isTouch = screenButton.checkIsClick(event);
            android.util.Log.e(cn.dream.android.opengles20.activity.SSViewPortActivity.TAG, ("isTouch=" + (isTouch)));
        }
    
    return true;
}