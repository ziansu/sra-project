@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    super.onSelectionChanged(selStart, selEnd);
    if ((state) == null) {
        return ;
    }
    android.util.Log.v("before", java.lang.String.valueOf(state.isUnderLineEnable()));
    changeSpanStateBySelection(selStart);
    android.util.Log.v("after", java.lang.String.valueOf(state.isUnderLineEnable()));
}