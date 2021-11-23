@java.lang.Override
public void dispatchDraw(android.graphics.Canvas canvas) {
    super.dispatchDraw(canvas);
    if ((gesturePath) != null) {
        canvas.drawPath(gesturePath, paint);
    }
    if ((gesturesContainer[0]) != (-1))
        canvas.drawLine(lastPathX, lastPathY, lastX, lastY, paint);
    
}