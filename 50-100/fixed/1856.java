@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if ((movies) != null) {
        gridView.setAdapter(null);
        adapter = new data.MoviesGridAdapter(getActivity(), movies);
        gridView.setClickable(true);
        gridView.setAdapter(adapter);
    }
    adapter.notifyDataSetChanged();
}