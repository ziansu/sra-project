@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.send_data)) {
        startSet();
    }else
        if ((item.getItemId()) == (R.id.delete)) {
            deleteSet();
        }
    
    return super.onOptionsItemSelected(item);
}