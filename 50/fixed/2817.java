@java.lang.Override
protected void onRemoveItemRequestFocus(android.view.View previousItem, boolean wasFocused) {
    if (previousItem != null) {
        android.widget.EditText editText = getEditTextFromView(previousItem);
        smoothScrollToView(previousItem);
        editText.requestFocus();
    }
}