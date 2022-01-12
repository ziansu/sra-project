@java.lang.Override
public synchronized void onDraw(android.graphics.Canvas canvas) {
    if ((drawRect) && (autoFocusSupported)) {
        canvas.drawRect(new android.graphics.Rect(((int) (x1)), ((int) (y1)), ((int) (x2)), ((int) (y2))), paint);
        countDownTimer.cancel();
        countDownTimer.start();
    }
    drawRect = false;
}