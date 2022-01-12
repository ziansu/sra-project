private void renderWord(final java.util.ArrayList<com.tamil.TChar> tamilChars) {
    jumbledChars = tamilChars;
    charLayout.removeAllViews();
    for (com.tamil.TChar aChar : tamilChars) {
        charLayout.addView(adapter.getView(aChar, tamilChars.indexOf(aChar), touchListener, dragListener));
    }
}