@java.lang.Override
public void onDraw(android.graphics.Canvas canvas) {
    activeLine = (tPosition) / (offsetBetweenLines);
    activeLineInt = ((int) (activeLine));
    for (int i = 0; i < ((countOfLines) - 1); i++) {
        drawLine(i, canvas);
    }
}