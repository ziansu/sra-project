protected android.graphics.Rect growDown(final int w, final int h) {
    final com.funzio.pure2D.utils.RectBinPacker.Node down = new com.funzio.pure2D.utils.RectBinPacker.Node(mRoot.x, ((mRoot.y) + (mRoot.height)), mRoot.width, h);
    final com.funzio.pure2D.utils.RectBinPacker.Node right = mRoot;
    mRoot = new com.funzio.pure2D.utils.RectBinPacker.Node(mRoot.x, mRoot.y, mRoot.width, ((mRoot.height) + h));
    mRoot.split(down, right);
    return down.occupy(w, h);
}