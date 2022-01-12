@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String movieId = ((java.lang.String) (v.getTag(R.id.poster_image_view)));
    android.content.Intent detailsActivityIntent = new android.content.Intent(getActivity(), br.com.dgimenes.popmovies.DetailsActivity.class);
    detailsActivityIntent.putExtra(DetailsActivity.MOVIE_ID_PARAM, movieId);
    startActivity(detailsActivityIntent);
}