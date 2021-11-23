@java.lang.Override
protected void onPreExecute() {
    android.support.design.widget.Snackbar.make(mRootView, "Finished task, saving...", Snackbar.LENGTH_INDEFINITE).show();
}