@java.lang.Override
public void onLinesRemoved(int... pos) {
    int maxPos = java.lang.Integer.MIN_VALUE;
    for (int p : pos)
        maxPos = java.lang.Math.max(maxPos, p);
    
    final int fMaxPos = maxPos;
    renderThread.execute(new net.dimatomp.tetris.TetrisView.Refresher(new android.graphics.Rect(0, 0, model.getWidth(), (fMaxPos + 1)), null));
}