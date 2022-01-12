public void setBackground(int dipRadius, int badgeColor) {
    int radius = dip2Px(dipRadius);
    float[] radiusArray = new float[]{ radius , radius , radius , radius , radius , radius , radius , radius };
    android.graphics.drawable.shapes.RoundRectShape roundRect = new android.graphics.drawable.shapes.RoundRectShape(radiusArray, null, null);
    android.graphics.drawable.ShapeDrawable bgDrawable = new android.graphics.drawable.ShapeDrawable(roundRect);
    bgDrawable.getPaint().setColor(badgeColor);
    setBackground(bgDrawable);
}