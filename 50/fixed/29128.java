@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.item_clear_history :
            db.clearDB();
            break;
    }
    return super.onOptionsItemSelected(item);
}