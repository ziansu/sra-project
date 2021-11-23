public void done(byte[] data, com.parse.ParseException e) {
    if (e == null) {
        android.graphics.Bitmap bitmap = reli.reliapp.co.il.reli.utils.Utils.getRoundedCornerBitmap(android.graphics.BitmapFactory.decodeByteArray(data, 0, data.length), 25);
        MainActivity.usersAvatars.put(senderID, bitmap);
        iv.setImageBitmap(bitmap);
    }
}