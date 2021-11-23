@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    pbCharacters.setVisibility(View.VISIBLE);
    if ((query.length()) > 0)
        presenter.loadCharacters(query);
    else
        presenter.loadCharacters();
    
    return false;
}