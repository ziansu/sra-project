@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.addDatabase :
            startActivity(new android.content.Intent(this, de.szut.passkeeper.Activity.CreateDatabaseActivity.class));
            break;
    }
    return super.onOptionsItemSelected(item);
}