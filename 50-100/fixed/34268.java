@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int w = org.strokeime.MeasureSpec.getSize(widthMeasureSpec);
    int h = org.strokeime.MeasureSpec.getSize(heightMeasureSpec);
    h = java.lang.Math.min(h, ((int) ((1.1F * w) / 2)));
    setMeasuredDimension(w, h);
}