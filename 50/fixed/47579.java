@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(android.text.TextUtils.isEmpty(newText))) {
        savedSearchFilter = newText;
    }
    searchFilter = newText;
    getLoaderManager().restartLoader(org.xbmc.kore.ui.AbstractListFragment.LOADER, null, this);
    return true;
}