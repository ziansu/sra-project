@java.lang.Override
public android.graphics.Rect draw(android.graphics.Canvas canvas) {
    android.graphics.Rect impactedRect = super.draw(canvas);
    android.graphics.Paint textPaint = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
    textPaint.setTextSize(35);
    textPaint.setColor(Color.RED);
    if ((impactedRect != null) && ((getScrRect()) != null))
        canvas.drawText(java.lang.String.valueOf(step), getScrRect().centerX(), getScrRect().centerY(), textPaint);
    
    return impactedRect;
}