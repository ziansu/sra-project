@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            android.content.Intent returnIntent = new android.content.Intent();
            setResult(com.meeple.activity.RESULT_OK, returnIntent);
            finish();
            return true;
        case R.id.action_block :
            if ((isBlock) == 0) {
                dialogforBlockorUnblock("Block");
            }else {
                dialogforBlockorUnblock("unblock");
            }
            return true;
        case R.id.action_add_image :
            showChooserDialog();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}