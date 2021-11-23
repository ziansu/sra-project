public void restoreOriginalImage() {
    android.util.Log.d("PuzzleAdapter", ("Restoring image " + (this.imgId)));
    this.img = bitmapOriginalImage.copy(Bitmap.Config.ARGB_8888, true);
    isChanged = false;
}