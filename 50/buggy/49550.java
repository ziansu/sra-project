@java.lang.Override
public void drag(final int x, final int y) {
    synchronized(labelLocation) {
        super.drag(x, y);
        paint(x, y, mergeController.getActiveFragmentId());
    }
    viewer.requestRepaint();
}