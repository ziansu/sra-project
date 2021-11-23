@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    updateSearch();
    java.lang.System.out.println("change");
    return false;
}