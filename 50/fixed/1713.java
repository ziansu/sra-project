@java.lang.Override
public void onFocusChange(android.view.View view, boolean hasFocus) {
    if (hasFocus) {
        provider.setOpInfo(getOperandInfo(instrGroup, index));
        lastSelectedSearchView = index;
    }
}