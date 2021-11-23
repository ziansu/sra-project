@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.menu_setting)) {
        android.widget.Toast.makeText(this, "You hit Settings..", Toast.LENGTH_LONG).show();
        return true;
    }
    if (id == (R.id.next)) {
        startActivity(new android.content.Intent(this, com.ckeeda.materialtest.SubActivity.class).putExtra("name", "SubActivity"));
    }
    return super.onOptionsItemSelected(item);
}