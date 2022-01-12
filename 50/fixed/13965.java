@java.lang.Override
public void onFigureMoved(android.graphics.Rect oldArea, android.graphics.Rect newArea) {
    renderThread.execute(new net.dimatomp.tetris.TetrisView.Refresher(oldArea));
}