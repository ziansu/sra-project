@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_logout)) {
        finish();
        android.content.Intent i = new android.content.Intent(this, com.jaredpetersen.hiccup.LoginActivity.class);
        startActivity(i);
        return true;
    }
    return super.onOptionsItemSelected(item);
}