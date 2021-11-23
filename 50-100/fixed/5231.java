private boolean setupGameTiles() {
    final java.util.ArrayList<java.io.File> bitmapFiles = new java.util.ArrayList<>();
    bitmapFiles.addAll(cw.kop.autobackground.files.FileHandler.getBitmapList());
    if ((bitmapFiles.size()) >= (cw.kop.autobackground.LiveWallpaperService.NUM_TO_WIN)) {
        java.util.Collections.shuffle(bitmapFiles);
        for (android.graphics.Bitmap bitmap : tileBitmaps) {
            try {
                bitmap.recycle();
            } catch (java.lang.Exception e) {
            }
        }
        tileBitmaps.clear();
        startLoadImageThreads(bitmapFiles, 0);
        return true;
    }
    return false;
}