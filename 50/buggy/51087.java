public void backupOriginalImage() {
    android.util.Log.d("PuzzleAdapter", "Backuping...");
    bitmapOriginalImage = img.copy(Bitmap.Config.ARGB_8888, true);
    android.util.Log.d("PuzzleAdapter", "Backuping done");
}