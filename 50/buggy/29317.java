@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ("".equals(newText)) {
        partialBills = bills;
        setListAdapter();
    }
    return true;
}