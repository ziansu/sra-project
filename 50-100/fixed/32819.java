@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            return false;
        case R.id.action_done :
            validator.validate();
            return false;
        case R.id.action_reserve :
            reserveWish();
            return false;
        case R.id.action_delete :
            deleteWish();
            return false;
    }
    return super.onOptionsItemSelected(item);
}