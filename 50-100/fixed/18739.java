@java.lang.Override
protected void onPostExecute(java.util.List<br.com.dgimenes.popmovies.model.MovieSummary> movieSummaries) {
    if (movieSummaries == null) {
        android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.error_downloading_movie_list), Toast.LENGTH_SHORT).show();
        return ;
    }
    adapter.clear();
    adapter.addAll(movieSummaries);
}