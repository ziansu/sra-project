@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressBar = ((android.widget.ProgressBar) (activity.findViewById(R.id.mainProgressBar)));
    progressBar.setVisibility(ProgressBar.VISIBLE);
}