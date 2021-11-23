@java.lang.Override
public void draw(android.graphics.Canvas c) {
    super.draw(c);
    onUpdateScrollbar();
    mScrollbar.draw(c);
}