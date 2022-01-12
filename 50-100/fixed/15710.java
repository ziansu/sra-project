@java.lang.Override
public boolean onSuggestionClick(int position) {
    android.database.MatrixCursor selectedRow = ((android.database.MatrixCursor) (suggestionAdapter.getItem(position)));
    int selectedCursorIndex = selectedRow.getColumnIndex(COLUMN_NAME_ADDRESS);
    java.lang.String address = selectedRow.getString(selectedCursorIndex);
    mSearchSearchView.setQuery(address, true);
    return true;
}