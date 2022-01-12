public void setRingtone(java.lang.String name, android.content.Context con) {
    java.io.File k = new java.io.File(((((((android.os.Environment.getExternalStorageDirectory().toString()) + (java.io.File.separator)) + "download") + (java.io.File.separator)) + name) + ".mp3"));
    putValuesFromFile(k);
    android.net.Uri uri = MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath());
    con.getContentResolver().insert(uri, values);
}