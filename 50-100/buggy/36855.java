@java.lang.Override
public void run() {
    java.io.File file = new java.io.File(context.getExternalFilesDir(null), pictureName);
    if (file != null) {
        android.graphics.Bitmap myBitmap = android.graphics.BitmapFactory.decodeFile(file.getAbsolutePath());
        if ((imageView) == null)
            throw new java.lang.NullPointerException();
        
        imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(null, myBitmap));
    }
}