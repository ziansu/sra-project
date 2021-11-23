@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    if ((bm) != null) {
        alImgThumbs.add(((alImgThumbs.size()) - 2), bm);
        alPathItems.add(((alPathItems.size()) - 2), fileSrc);
        gvPhotoGallery.setAdapter(gridAdapter);
    }else {
        showToastMessage(getString(R.string.UnableToAddImage));
    }
    progressLoadingImages.dismiss();
}