@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    if (((albumList) != null) && ((_listDataChild) != null)) {
        if (s.isEmpty()) {
            adapter.setall(albumList, _listDataChild);
            return false;
        }
        if ((s.length()) < 1) {
            adapter.setall(albumList, _listDataChild);
            return false;
        }
        adapter.filterData(albumList, _listDataChild, s);
        return true;
    }
    return false;
}