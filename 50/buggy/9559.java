@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    movieAdapter.notifyDataSetChanged();
    if (!(movieList.isEmpty())) {
        mListener.onMovieSelected(movieList.get(0), true);
    }
}