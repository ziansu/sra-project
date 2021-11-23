protected android.graphics.Rect growRight(final int w, final int h) {
    final com.funzio.pure2D.utils.RectBinPacker.Node down = mRoot;
    final com.funzio.pure2D.utils.RectBinPacker.Node right = new com.funzio.pure2D.utils.RectBinPacker.Node(((mRoot.x) + (mRoot.width)), mRoot.y, w, mRoot.height);
    mRoot = new com.funzio.pure2D.utils.RectBinPacker.Node(mRoot.x, mRoot.y, ((mRoot.width) + w), mRoot.height);
    mRoot.mRight = right;
    mRoot.mDown = down;
    return right.occupy(w, h);
}