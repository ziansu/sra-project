@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if ((radius) == 0) {
        if (!(isCircleFillView))
            return ;
        
    }
    canvas.translate(((getMeasuredWidth()) / 2), ((getMeasuredHeight()) / 2));
    drawRing(canvas);
    drawPrimaryText(canvas);
    drawSecondaryText(canvas);
}