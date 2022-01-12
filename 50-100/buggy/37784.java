public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    java.util.HashMap<java.lang.String, java.lang.String> currentData;
    currentData = com.example.android.popmovies.MainActivityFragment.moviesInfo.get(position);
    android.util.Log.v(com.example.android.popmovies.MainActivityFragment.TAG, ("currentMovieData: " + (currentData.toString())));
    android.content.Intent intent = new android.content.Intent(getContext(), com.example.android.popmovies.DetailsActivity.class);
    intent.putExtra("currentMovieData", currentData);
    startActivity(intent);
}