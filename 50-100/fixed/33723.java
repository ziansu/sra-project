@java.lang.Override
public void onDraw(android.graphics.Canvas canvas) {
    if (mShouldDraw) {
        canvas.scale(mScale, mScale);
        for (com.peterlaurence.trekadvisor.menu.mapview.components.PathView.DrawablePath drawablePath : mDrawablePaths) {
            drawablePath.paint.setStrokeWidth(((drawablePath.width) / (mScale)));
            canvas.drawLines(drawablePath.path, drawablePath.paint);
        }
    }
    super.onDraw(canvas);
}