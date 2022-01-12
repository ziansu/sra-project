@java.lang.Override
protected void onPostExecute(java.lang.String queryResult) {
    if (queryResult != null) {
        android.util.Log.d(com.sriky.popflix.PopularMoviesActivity.TAG, ("onPostExecute: queryResult.length() = " + (queryResult.length())));
        mMovieDataArrayList.addAll(com.sriky.popflix.utilities.MovieDataHelper.getListfromJSONResponse(queryResult));
        onDataLoadComplete();
    }else {
        onDataLoadFailed(0);
    }
}