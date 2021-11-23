@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if ((radius) == 0) {
        if (!(isCircleFillView))
            return ;
        
    }
    drawRing(canvas);
    canvas.translate(((getMeasuredWidth()) / 2), ((getMeasuredHeight()) / 2));
    drawPrimaryText(canvas);
    drawSecondaryText(canvas);
}