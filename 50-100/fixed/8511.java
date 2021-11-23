@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    super.onSelectionChanged(selStart, selEnd);
    if ((state) == null) {
        return ;
    }
    if (selStart == selEnd) {
        changeSpanStateBySelection(selStart);
    }else {
        changeSpanStateBySelection(selStart, selEnd);
    }
}