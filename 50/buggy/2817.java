@java.lang.Override
protected void onRemoveItemRequestFocus(android.view.View previousItem, boolean wasFocused) {
    android.widget.EditText editText = getEditTextFromView(previousItem);
    smoothScrollToView(previousItem);
    editText.requestFocus();
}