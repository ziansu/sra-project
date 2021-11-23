@java.lang.Override
protected void onPostExecute(java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> hashMaps) {
    super.onPostExecute(hashMaps);
    if ((hashMaps != null) && (!(hashMaps.equals("")))) {
        com.example.android.popmovies.MainActivityFragment.imagesAdapter.setGridData(hashMaps);
    }else {
        android.widget.Toast.makeText(com.example.android.popmovies.MainActivityFragment.mContext, R.string.error_msg_loading, Toast.LENGTH_SHORT);
    }
}