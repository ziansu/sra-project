@java.lang.Override
public void onSelectionChanged(int selStart, int selEnd) {
    if ((selStart != (lastCursorPosition)) && (selStart != 0)) {
        updateContent(selStart);
        setEditTextBody(selStart);
        lastCursorPosition = selStart;
    }
}