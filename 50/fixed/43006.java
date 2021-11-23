@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((((com.anjoola.sharewear.ContactsAllFragment) (mFragment)).mAdapter) != null)
        ((com.anjoola.sharewear.ContactsAllFragment) (mFragment)).mAdapter.getFilter().filter(newText);
    
    return true;
}