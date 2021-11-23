@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_about)) {
        return true;
    }
    if (id == (R.id.action_logout)) {
        onl.deepspace.wgs.Helper.setEmail(this, "");
        onl.deepspace.wgs.Helper.setPw(this, "");
        android.content.Intent intent = new android.content.Intent(this, onl.deepspace.wgs.LoginActivity.class);
        startActivity(intent);
    }
    return super.onOptionsItemSelected(item);
}