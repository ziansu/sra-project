public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.dbView :
            final android.content.Intent i = new android.content.Intent(this, com.hswgt.florian.organizer.AndroidDatabaseManager.class);
            startActivity(i);
            return true;
        case R.id.addListButton :
            addListDialog();
            return true;
    }
    return super.onOptionsItemSelected(item);
}