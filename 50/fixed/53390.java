@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    closeInputMethod();
    getData((searchWord = query), 0);
    return true;
}