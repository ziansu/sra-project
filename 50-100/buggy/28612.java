@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent e) {
    if ((android.view.MotionEvent.ACTION_UP) == (e.getAction())) {
        int index = touchDetector.getIndexOfTouchedDrawElement(symbolCoordinates, e.getX(), e.getY());
        if ((-1) != index) {
            org.catrobat.musicdroid.pocketmusic.note.symbol.Symbol symbol = symbols.get(index);
            symbol.setMarked(symbol.isMarked());
        }
    }
    return true;
}