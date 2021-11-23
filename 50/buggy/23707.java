@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    bitmaps.add(bmp);
    movieAdapter.notifyDataSetChanged();
    listView.setAdapter(movieAdapter);
    super.onPostExecute(result);
}