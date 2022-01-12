@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String s) {
    getArticles(s);
    return true;
}