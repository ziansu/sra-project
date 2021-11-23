@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if (canvas != null) {
        canvas.drawColor(Color.BLACK);
        note.update(canvas);
    }
}