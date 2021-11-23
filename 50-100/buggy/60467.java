public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.dbView)) {
    }
    switch (item.getItemId()) {
        case R.id.dbView :
            final android.content.Intent i = new android.content.Intent(this, com.hswgt.florian.organizer.AndroidDatabaseManager.class);
            startActivity(i);
            return true;
        case R.id.addListButton :
            addListDialog();
    }
    return super.onOptionsItemSelected(item);
}