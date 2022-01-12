@java.lang.Override
public void onClick(android.view.View v) {
    float score = computeScore();
    saveDrawing(v);
    drawView.setEnabled(true);
    started = false;
    callback.onFinish(score, (10000 - (duration)));
}