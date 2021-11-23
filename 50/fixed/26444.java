@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressBar = ((android.widget.ProgressBar) (activity.findViewById(R.id.mainProgressBar)));
    if ((progressBar) != null) {
        progressBar.setVisibility(ProgressBar.VISIBLE);
    }
}