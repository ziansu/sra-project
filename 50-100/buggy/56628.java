@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    center_x = w / 2;
    center_y = h / 2;
    max_radius = (w > h) ? w : h;
    min_radius = (w < h) ? w : h;
    invalidate();
}