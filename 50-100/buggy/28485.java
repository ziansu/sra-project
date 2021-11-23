@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.newentry :
            return true;
        case R.id.settings :
            android.content.Intent intent = new android.content.Intent(this, rebeccaansems.diabetestracker.Settings.class);
            startActivity(intent);
    }
    return super.onOptionsItemSelected(item);
}