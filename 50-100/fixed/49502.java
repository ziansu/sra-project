@java.lang.Override
public void siteSelectpositiveClick(android.app.DialogFragment fragment, int which) {
    java.lang.String[] sites = getResources().getStringArray(R.array.site_select_array);
    searchsite = sites[which];
    setSiteName();
    if ((adapter) != null) {
        adapter.setDisplaySiteName(sitename);
    }
    startProgressDialog();
    getTags(tagcount, tagsearch);
}