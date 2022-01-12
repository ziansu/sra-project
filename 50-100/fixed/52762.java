public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    android.graphics.Bitmap myBitmap;
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inPurgeable = true;
    options.outHeight = 50;
    options.outWidth = 50;
    options.inSampleSize = 4;
    if ((imageIDs) != null) {
        java.io.File imgFile = new java.io.File(imageIDs[position]);
        myBitmap = android.graphics.BitmapFactory.decodeFile(imgFile.getAbsolutePath(), options);
        currentBigImage.setImageBitmap(myBitmap);
        currentImagePath = imageIDs[position];
    }
}