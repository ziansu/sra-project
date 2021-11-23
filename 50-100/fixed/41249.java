@java.lang.Override
public void afterTextChanged(android.text.Editable incomingEditable) {
    final java.lang.String incomingString = incomingEditable.toString();
    final java.lang.String currentSearchText = getSearchText().toString();
    if (incomingString.equals(currentSearchText)) {
        filterString = currentSearchText;
        if ((adapter) != null) {
            adapter.filterByString(filterString);
        }
    }
    if (!(isUsingActionBar())) {
        lastQueryString = filterString;
    }
}