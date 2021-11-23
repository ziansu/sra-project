@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((newText.length()) == 0) {
        pbCharacters.setVisibility(View.VISIBLE);
        presenter.loadCharacters();
    }
    return false;
}