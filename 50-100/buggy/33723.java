@java.lang.Override
public void onDraw(android.graphics.Canvas canvas) {
    if (mShouldDraw) {
        for (com.peterlaurence.trekadvisor.menu.mapview.components.PathView.DrawablePath drawablePath : mDrawablePaths) {
            canvas.scale(mScale, mScale);
            drawablePath.paint.setStrokeWidth(((drawablePath.width) / (mScale)));
            canvas.drawLines(drawablePath.path, drawablePath.paint);
        }
    }
    super.onDraw(canvas);
}