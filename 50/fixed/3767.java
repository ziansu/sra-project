@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    mProgressBar.setVisibility(View.GONE);
    mArrayAdapter.notifyDataSetChanged();
}