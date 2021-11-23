@java.lang.Override
protected void onPause() {
    if (pDialog.isShowing())
        pDialog.dismiss();
    
    super.onPause();
}