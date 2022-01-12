@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    this.grid = new com.example.jacek.streamthegame.Grid(this.getContext(), this.nRows, this.nCols, ((getWidth()) / (this.nCols)), ((getHeight()) / (this.nRows)));
    this.grid.tryAddObject(Sprite.short_pipe, 2, 1);
    this.thread.setRunning(true);
    this.thread.start();
}