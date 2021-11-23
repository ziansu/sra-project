@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String s) {
    try {
        str = java.net.URLDecoder.decode(s, "utf-8");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    getArticles(str);
    return true;
}