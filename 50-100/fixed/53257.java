@java.lang.Override
protected void onProgressUpdate(java.lang.Integer... values) {
    int messageResId = values[0];
    if ((this.getView()) != null) {
        android.support.design.widget.Snackbar errorSnackbar = android.support.design.widget.Snackbar.make(this.getView(), messageResId, Snackbar.LENGTH_LONG);
        errorSnackbar.setAction(R.string.retry, new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                us.v4lk.transrock.fragments.RoutesFragment.FetchRoutesTask newTask = new us.v4lk.transrock.fragments.RoutesFragment.FetchRoutesTask();
                newTask.execute(routes);
            }
        });
        errorSnackbar.show();
    }
}