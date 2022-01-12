@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if (((getCount()) != (oldCount)) && ((getCount()) > 0)) {
        int height = (getChildAt(0).getHeight()) + 1;
        oldCount = getCount();
        params = getLayoutParams();
        params.height = (getChildAt(0).getHeight()) * 5;
        setLayoutParams(params);
    }
    super.onDraw(canvas);
}