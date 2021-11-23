@java.lang.Override
public void onClick(android.view.View v) {
    if (((movieObject) != null) && ((!(movieObject.image.equalsIgnoreCase("N/A"))) && (!(movieObject.image.equalsIgnoreCase(""))))) {
        android.content.Intent i = new android.content.Intent(getActivity(), com.movie.apps.MovieFullPosterActivity.class);
        i.putExtra(AppConstatnts.movieObjectTag, movieObject);
        getActivity().startActivity(i);
    }
}