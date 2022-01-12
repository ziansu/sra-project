@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add :
            add();
            break;
    }
    return super.onOptionsItemSelected(item);
}