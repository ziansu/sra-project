@java.lang.Override
public void onDraw(android.graphics.Canvas canvas, android.graphics.Rect blockRect, android.graphics.Rect contentRect) {
    updatePaint();
    drawBackGround(canvas, blockRect, contentRect);
    drawBorder(canvas, blockRect, contentRect);
    drawFlash(canvas, contentRect);
    java.lang.String text = getText();
    if (android.text.TextUtils.isEmpty(text)) {
        drawDefaultText(canvas, contentRect);
    }else {
        drawText(canvas, getText(), contentRect, hasBottomLine());
    }
}