public void fetchMovieGallery(int movieIdForQuery) {
    galleryTask = new com.example.android.popularmovies.fetchRawJSON.FetchMovieGalleryTask(getActivity(), ((android.support.v4.view.ViewPager) (getView().findViewById(R.id.pager))));
    galleryTask.execute(java.lang.Integer.toString(movieIdForQuery));
}