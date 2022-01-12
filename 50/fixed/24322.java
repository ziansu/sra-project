private void setPosterAdapter() {
    android.util.Log.v("Home Fragemnt", "Setting Adapter");
    imageAdapter.clear();
    imageAdapter.addAll(tmDbMovieArrayList);
}