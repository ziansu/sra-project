@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.cancel :
            android.content.Intent intent = new android.content.Intent(this, com.example.photosharing.MenuActivity.class);
            startActivity(intent);
            finish();
            return true;
        case R.id.action_settings :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}