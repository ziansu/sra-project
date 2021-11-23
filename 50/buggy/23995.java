@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    screenHeight = com.github.pedrovgs.MeasureSpec.getSize(heightMeasureSpec);
    screenWidth = com.github.pedrovgs.MeasureSpec.getSize(widthMeasureSpec);
}