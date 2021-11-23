@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            drawerLayout.openDrawer(GravityCompat.START);
            onBackPressed();
            return true;
    }
    return super.onOptionsItemSelected(item);
}