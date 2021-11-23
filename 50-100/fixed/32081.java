void drawEmojiFromCache(android.graphics.Canvas c, java.lang.String emojiName, float markerPosX, float markerPosY) {
    android.graphics.Bitmap emojiBitmap;
    try {
        emojiBitmap = getEmojiBitmapByName(emojiName);
    } catch (java.io.FileNotFoundException e) {
        android.util.Log.e(com.affectiva.affdexme.DrawingView.LOG_TAG, "Error, file not found!", e);
        return ;
    }
    if (emojiBitmap != null) {
        c.drawBitmap(emojiBitmap, markerPosX, markerPosY, null);
    }
}