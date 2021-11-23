@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.networkImageView :
            onImageClickListener.onImageClick(((results.poster_path) != null ? results.poster_path : results.backdrop_path));
            break;
        default :
            com.adithyaupadhya.moviemaniac.tvseries.tvseriesdetails.TVSeriesDetailsActivity.startActivityIntent(context, results);
    }
}