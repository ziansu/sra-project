private void init() {
    if (isInEditMode()) {
        return ;
    }
    path = new android.graphics.Path();
    paint = new android.graphics.Paint();
    paint.setColor(android.graphics.Color.argb(150, 43, 43, 43));
    paint.setAntiAlias(true);
    setBackgroundResource(R.drawable.bg);
}