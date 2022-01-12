@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((alertDialog) != null) {
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
    handlesForCamera = imageAdapter.getSelectedIDs();
    imagesList = null;
}