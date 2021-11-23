@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    setMeasuredDimension(com.example.blockwatch.MeasureSpec.getSize(widthMeasureSpec), com.example.blockwatch.MeasureSpec.getSize(heightMeasureSpec));
}