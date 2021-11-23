@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    searchInput = searchMovieView.getText().toString().toLowerCase(java.util.Locale.getDefault());
    movieListAdapter.filter(searchInput, chosenCategory);
}