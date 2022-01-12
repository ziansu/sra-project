public void onDraw(android.graphics.Canvas canvas) {
    notepad.draw(canvas, paint);
    try {
        notepad.update();
        if (notepad.stopped()) {
            isAnimated = false;
        }
        java.lang.Thread.sleep(50);
        invalidate();
    } catch (java.lang.Exception ex) {
    }
}