@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ("".equals(newText)) {
        if ((bills) != null) {
            partialBills = bills;
        }
        setListAdapter();
    }
    return true;
}