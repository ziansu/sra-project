public void setGridData(java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> mGridData) {
    this.mGridData = mGridData;
    android.util.Log.v(com.example.android.popmovies.MovieImagesAdapter.TAG, mGridData.get(0).get("imageUrl"));
    notifyDataSetChanged();
}