@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int w = org.strokeime.MeasureSpec.getSize(widthMeasureSpec);
    int h = org.strokeime.MeasureSpec.getSize(heightMeasureSpec);
    h = ((int) ((1.1F * (java.lang.Math.min(w, h))) / 2));
    setMeasuredDimension(w, h);
}