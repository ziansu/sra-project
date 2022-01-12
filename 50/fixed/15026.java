@java.lang.Override
public void onTextChanged(java.lang.String newText) {
    if ((listener) != null) {
        listener.onSearchQuery(newText);
    }
}