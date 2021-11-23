@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.fabiohh.popularmovies.models.MovieItem> movieItems) {
    if ((movieItems != null) && ((movieItems.size()) > 0)) {
        mImageAdapter.setData(movieItems);
    }
    if ((context) instanceof com.example.fabiohh.popularmovies.MainActivity) {
        ((com.example.fabiohh.popularmovies.MainActivity) (context)).handleNoAPIResponse();
    }
    super.onPostExecute(movieItems);
}