@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
    switch (menuItem.getItemId()) {
        case android.R.id.home :
            android.content.Intent homeIntent = new android.content.Intent(this, com.nightcap.previously.MainActivity.class);
            homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);
            break;
        case R.id.action_save_event :
            saveEvent();
            break;
    }
    return super.onOptionsItemSelected(menuItem);
}