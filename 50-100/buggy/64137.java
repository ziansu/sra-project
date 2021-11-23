@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    paint.setColor(colorDefault);
    canvas.drawArc(rectF, com.example.kolin.customview.CircleProgressView.ANGEL_OFFSET, 360, false, paint);
    int progress = ((int) ((360 * (currentAmount)) / (targetAmount)));
    paint.setColor(colorProgress);
    canvas.drawArc(rectF, com.example.kolin.customview.CircleProgressView.ANGEL_OFFSET, progress, false, paint);
}