@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    currentSelection = getText().toString().substring(selStart, selEnd);
    super.onSelectionChanged(selStart, selEnd);
}