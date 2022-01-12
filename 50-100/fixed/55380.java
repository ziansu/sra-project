@java.lang.Override
public void onSurfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    super.onSurfaceChanged(holder, format, width, height);
    surfaceHolder = holder;
    android.graphics.Canvas canvas = holder.lockCanvas();
    wallPaperCreator = null;
    getWallPaperCreator().draw(canvas);
    holder.unlockCanvasAndPost(canvas);
}