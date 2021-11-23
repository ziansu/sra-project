@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!("".equals(newText))) {
        performFilter(newText);
    }else {
        return false;
    }
    return false;
}