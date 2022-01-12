@java.lang.Override
protected void onProgressUpdate(java.lang.String... values) {
    if ((snackbar) != null)
        snackbar.setText(values[0]);
    
}