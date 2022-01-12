@java.lang.Override
public void success(com.duckma.popularmovies.api.DetailModelCall detailModelCall, retrofit.client.Response response) {
    addSeparator("Reviews");
    for (com.duckma.popularmovies.models.DetailModel review : detailModelCall.getResults()) {
        review.setContentType(DetailModel.TYPE_REVIEW);
        mDetailObjects.add(review);
    }
    mAdapter.notifyDataSetChanged();
}