@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    super.onSelectionChanged(selStart, selEnd);
    if ((this.cursorPosition) > (-1)) {
        setSelection(this.cursorPosition);
        this.cursorPosition = -1;
    }
}