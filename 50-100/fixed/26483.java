public void done(byte[] data, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.d("test", "We've got data in data.");
        bmp = android.graphics.BitmapFactory.decodeByteArray(data, 0, data.length);
        topImage.setImageBitmap(bmp);
    }else {
        android.util.Log.d("test", "There was a problem downloading the data.");
    }
}