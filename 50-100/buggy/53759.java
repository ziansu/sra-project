@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap[] result) {
    thumbBitmap = result[0];
    largeBitmap = result[1];
    if ((thumbBitmap) == null)
        thumbBitmap = largeBitmap;
    
    if ((largeBitmap) == null)
        largeBitmap = thumbBitmap;
    
    instance.notifyDataSetChanged();
}