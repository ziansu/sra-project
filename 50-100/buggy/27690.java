@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        new xyz.farshad.vocab.component.Server.DataTransfer().execute();
        android.widget.Toast.makeText(this, "retrieve from server...", Toast.LENGTH_LONG).show();
        showCategoryList(true);
        return true;
    }
    return super.onOptionsItemSelected(item);
}