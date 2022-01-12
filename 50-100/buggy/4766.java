@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
        case R.id.clear :
            editTextWrapper.setText("");
            return true;
        case R.id.go :
            invokeSearch();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}