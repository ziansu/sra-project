public void showProgressBar(java.lang.String msg) {
    if ((progressBar) != null) {
        progressBar = new com.afollestad.materialdialogs.MaterialDialog.Builder(this).content(msg).progress(true, 0).show();
    }
}