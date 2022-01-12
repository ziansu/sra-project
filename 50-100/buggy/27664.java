@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            saveProduct();
            finish();
            return true;
        case R.id.action_delete :
            return true;
        case android.R.id.home :
            if (!(mProductHasChanged)) {
                onBackPressed();
                return true;
            }
            android.content.DialogInterface.OnClickListener discardButtonClickListener = new android.content.DialogInterface.OnClickListener() {
                @java.lang.Override
                public void onClick(android.content.DialogInterface dialogInterface, int i) {
                    finish();
                }
            };
            showUnsavedChangesDialog(discardButtonClickListener);
            return true;
    }
    return super.onOptionsItemSelected(item);
}