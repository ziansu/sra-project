@java.lang.Override
public void onBackPressed() {
    android.support.v7.widget.SearchView searchView = ((android.support.v7.widget.SearchView) (android.support.v4.view.MenuItemCompat.getActionView(menu.findItem(R.id.action_search))));
    if (!(searchView.isIconified())) {
        searchView.setIconified(true);
    }else
        if (backPressed) {
            super.onBackPressed();
        }else {
            android.widget.Toast.makeText(this, "Press again to leave the app", Toast.LENGTH_LONG).show();
        }
    
}