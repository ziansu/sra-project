@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if ((model.AppModel.getInstance().getMovies()) != null) {
        this.movies = model.AppModel.getInstance().getMovies();
        if ((this.movies) != null) {
            gridView.setAdapter(null);
            adapter = new data.MoviesGridAdapter(getActivity(), this.movies);
            gridView.setClickable(true);
            gridView.setAdapter(adapter);
        }
        adapter.notifyDataSetChanged();
    }
}