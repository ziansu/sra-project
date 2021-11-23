@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.refresh :
            io.ohalloran.crypto.data.ParseFactory.refresh(this);
    }
    return false;
}