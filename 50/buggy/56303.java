@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    java.lang.CharSequence word = bookView.getWordAt(e.getX(), e.getY());
    selectedWord = word;
    openContextMenu(bookView);
}