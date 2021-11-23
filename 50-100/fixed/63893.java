private void renderWord(final java.util.ArrayList<com.tamil.TChar> tamilChars) {
    jumbledChars = tamilChars;
    charLayout.removeAllViews();
    for (int i = 0; i < (tamilChars.size()); i++) {
        charLayout.addView(adapter.getView(tamilChars.get(i), i, touchListener, dragListener));
    }
}