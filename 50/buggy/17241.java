@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    progressBar.setVisibility(View.VISIBLE);
    android.widget.Toast.makeText(this, "Started Loading", Toast.LENGTH_SHORT).show();
    forceLoad();
}