public int getCurrentCaretPosition() {
    int position = -1;
    if (openedInEditor) {
        javax.swing.text.Caret caret = cookie.getOpenedPanes()[0].getCaret();
        position = caret.getDot();
    }
    return position;
}