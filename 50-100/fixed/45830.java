@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.example.android.popularmovies.Movie movie = movieAdapter.getItem(position);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.android.popularmovies.DetailActivity.class).putExtra("movie", movie);
    startActivity(intent);
}