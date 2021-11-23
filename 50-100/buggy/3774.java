@java.lang.Override
public boolean swipeRight(android.view.MotionEvent e) {
    int position = authorRV.getChildPosition(authorRV.findChildViewUnder(e.getX(), e.getY()));
    adapter.toggleSelection(position);
    author = adapter.getSelected();
    if ((author) == null) {
        return false;
    }
    adapter.makeSelectedRead();
    return true;
}