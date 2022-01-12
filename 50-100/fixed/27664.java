@java.lang.Override
public void onBackPressed() {
    if (!(mProductHasChanged)) {
        super.onBackPressed();
        return ;
    }
    android.content.DialogInterface.OnClickListener discardButtonClickListener = new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            finish();
        }
    };
    showUnsavedChangesDialog(discardButtonClickListener);
}