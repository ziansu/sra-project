@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    int count = getChildCount();
    for (int i = 0; i < count; i++) {
        android.view.View childView = getChildAt(i);
        measureChild(childView, widthMeasureSpec, heightMeasureSpec);
    }
    mScreenHeight = getMeasuredHeight();
}