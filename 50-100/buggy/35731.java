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
            android.widget.Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}