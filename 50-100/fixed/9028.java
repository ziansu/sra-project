private void rebuild(boolean bracketsPairsTouched, boolean singleBracketsTouched, boolean hintsTouched, boolean alwaysRedraw) {
    boolean update = alwaysRedraw;
    if (bracketsPairsTouched) {
        update |= updateSurroundingPairsToPaint(_caretOffset);
        update |= clearHoveredPairsToPaint();
    }
    if (singleBracketsTouched)
        update |= updateSingleBrackets();
    
    update |= updateHints();
    if (update) {
        _textWidget.getDisplay().asyncExec(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                _textWidget.redraw();
            }
        });
    }
}