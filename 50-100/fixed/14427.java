@java.lang.Override
public void success(com.duckma.popularmovies.api.DetailModelCall detailModelCall, retrofit.client.Response response) {
    if ((detailModelCall.getResults().size()) > 0) {
        addSeparator("Trailers");
        for (com.duckma.popularmovies.models.DetailModel trailer : detailModelCall.getResults()) {
            trailer.setContentType(DetailModel.TYPE_TRAILER);
            mDetailObjects.add(trailer);
        }
        mAdapter.notifyDataSetChanged();
    }
    getReviews();
}