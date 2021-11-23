@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((newText.length()) == 0) {
        presenter.loadCharacters();
        pbCharacters.setVisibility(View.VISIBLE);
    }
    return false;
}