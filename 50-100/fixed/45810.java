@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    for (int i = 0; i < (getChildCount()); i++) {
        android.view.View childView = getChildAt(i);
        measureChild(childView, widthMeasureSpec, heightMeasureSpec);
    }
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}