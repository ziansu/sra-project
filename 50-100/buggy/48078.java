@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    android.support.design.widget.Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    float x = event.getX();
    float y = event.getY();
    ((info.jefer.customview1.CustomView) (v)).moveToPoint(new info.jefer.common.Point(java.lang.Math.round(x), java.lang.Math.round(y)));
    return true;
}