@java.lang.Override
public void onClick(android.view.View v) {
    android.graphics.BitmapFactory.Options bitmapOptions = new android.graphics.BitmapFactory.Options();
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(picsList.get(i), bitmapOptions);
    largeImage.setImageBitmap(bitmap);
    largeImage.setVisibility(View.VISIBLE);
}