@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_toggle_log :
        case R.id.help :
            startActivity(item.getIntent());
        case R.id.settings :
            startActivity(item.getIntent());
    }
    return super.onOptionsItemSelected(item);
}