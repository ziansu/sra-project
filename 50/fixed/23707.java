@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    movieAdapter.notifyDataSetChanged();
    listView.setAdapter(movieAdapter);
}