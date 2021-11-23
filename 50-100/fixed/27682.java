@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    if ((bm) != null) {
        alImgThumbs.add(bm);
        alPathItems.add(fileSrc);
        gvPhotoGallery.setAdapter(gridAdapter);
    }else {
        showToastMessage(getString(R.string.UnableToAddImage));
    }
    progressLoadingImages.dismiss();
}