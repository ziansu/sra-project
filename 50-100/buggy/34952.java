@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(Constants.DETAIL_LOADER, null, this);
    getLoaderManager().initLoader(Constants.TRAILER_LOADER, null, this);
    getLoaderManager().initLoader(Constants.REVIEW_LOADER, null, this);
    insertTrailers();
    insertReviews();
}