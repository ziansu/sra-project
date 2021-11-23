@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    progressBar.setVisibility(View.VISIBLE);
    forceLoad();
}