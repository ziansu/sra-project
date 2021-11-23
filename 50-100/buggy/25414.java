@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_restart)) {
        brands.clear();
        startActivity(new android.content.Intent(this, com.example.tmdhelper.TMDmenu.class));
        finish();
        return true;
    }
    return super.onOptionsItemSelected(item);
}