@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (((listViewAdapter) != null) && (!(listViewAdapter.isEmpty()))) {
        listViewAdapter.filter(newText);
        return true;
    }
    return false;
}