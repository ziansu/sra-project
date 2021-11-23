@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int childrenCount = getChildCount();
    for (int i = 0; i < childrenCount; i++) {
        android.view.View child = getChildAt(i);
        measureChild(child, widthMeasureSpec, heightMeasureSpec);
    }
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}