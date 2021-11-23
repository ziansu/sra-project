@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((listViewAdapter) != null) {
        listViewAdapter.filter(newText);
        return true;
    }
    return false;
}