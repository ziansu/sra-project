@java.lang.Override
protected void onPause() {
    if (((pDialog) != null) && (pDialog.isShowing()))
        pDialog.dismiss();
    
    super.onPause();
}