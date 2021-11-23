@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    int threshold = searchEditText.getThreshold();
    searchEditText.setThreshold(1);
    searchEditText.showDropDown();
    searchEditText.setThreshold(threshold);
    suggestionsAdapter.notifyDataSetChanged();
    progress.setVisibility(View.GONE);
}