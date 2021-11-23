public void onClickDownloadFavorite(java.lang.String name) {
    android.widget.Toast.makeText(this, "Your Website has been downloaded", Toast.LENGTH_SHORT);
    presenter.onDownloadClickedFavorite(name);
}