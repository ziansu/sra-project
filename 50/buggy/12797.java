@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    progressBar.setVisibility(View.GONE);
    recyclerView.setVisibility(View.GONE);
    android.support.design.widget.Snackbar.make(v, "Unable to load fake people", Snackbar.LENGTH_LONG).show();
}