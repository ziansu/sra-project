@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    removeAllViews();
    addView(gridLayout);
    android.util.Log.i("WASD", ("" + ((layout.getHeight()) / 5)));
}