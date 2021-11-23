@java.lang.Override
protected void onPreExecute() {
    earthquakeListView.setVisibility(View.GONE);
    reloadButton.setVisibility(View.GONE);
    progressBar.setVisibility(View.VISIBLE);
    textView.setVisibility(View.VISIBLE);
}