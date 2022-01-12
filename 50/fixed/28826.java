public void setTemporaryImage(android.graphics.Bitmap bitmap) {
    this.img = bitmap.copy(Bitmap.Config.ARGB_8888, true);
}