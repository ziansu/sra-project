@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.allfeedsitem, menu);
    android.view.MenuItem searchItem = menu.findItem(R.id.action_search);
    return super.onCreateOptionsMenu(menu);
}