@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    for (int i = 0; i < (getChildCount()); i++) {
        android.view.View childView = getChildAt(i);
        measureChild(childView, widthMeasureSpec, heightMeasureSpec);
        childView.measure(com.example.administrator.gc.widget.MeasureSpec.makeMeasureSpec(childView.getMeasuredWidth(), MeasureSpec.EXACTLY), com.example.administrator.gc.widget.MeasureSpec.makeMeasureSpec(childView.getMeasuredHeight(), MeasureSpec.EXACTLY));
    }
    setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
}