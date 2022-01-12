@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.widget.Toast.makeText(this, ("搜索" + query), Toast.LENGTH_SHORT).show();
    return false;
}