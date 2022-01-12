@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    mLoadingDialog.dismiss();
    switch (result) {
        case FAV_SUCCESS :
            isFavorite = true;
            break;
        case FAV_NONE :
            isFavorite = false;
            break;
        default :
            android.util.Log.e("ERR", "Error in retrieving fav");
            break;
    }
    setFavoriteImage();
}