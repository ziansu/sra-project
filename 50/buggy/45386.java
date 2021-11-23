@java.lang.Override
public void done(byte[] bytes, com.parse.ParseException e) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    itemImage.setImageBitmap(bitmap);
}