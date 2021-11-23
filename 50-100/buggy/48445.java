@java.lang.Override
public void onBackPressed() {
    android.view.MenuItem btnSearch = ((android.view.MenuItem) (findViewById(R.id.btn_search)));
    assert btnSearch != null;
    android.support.v7.widget.SearchView searchView = ((android.support.v7.widget.SearchView) (btnSearch.getActionView()));
    if ((searchView != null) && (!(searchView.isIconified()))) {
        searchView.setIconified(true);
    }else {
        super.onBackPressed();
    }
}