@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    super.onSelectionChanged(selStart, selEnd);
    if ((this.cursorPosition) >= (getText().toString().length())) {
        setSelection(this.cursorPosition);
        this.cursorPosition = -1;
    }
}