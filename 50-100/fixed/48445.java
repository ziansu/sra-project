@java.lang.Override
public void onBackPressed() {
    android.support.v7.widget.SearchView searchView = ((android.support.v7.widget.SearchView) (findViewById(R.id.btn_search)));
    if ((searchView != null) && (!(searchView.isIconified()))) {
        searchView.setIconified(true);
    }else {
        super.onBackPressed();
    }
}