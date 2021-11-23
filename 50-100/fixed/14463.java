private void initMusic() {
    mediaPlayer = new android.media.MediaPlayer();
    java.lang.String[] projection = new java.lang.String[]{ MediaStore.Audio.Media._ID , MediaStore.Audio.Media.DATA , MediaStore.Audio.Media.TITLE , MediaStore.Audio.Media.DISPLAY_NAME , MediaStore.Audio.Media.DURATION };
    java.lang.String selection = (MediaStore.Audio.Media.IS_MUSIC) + " != 0";
    musicCursor = getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, selection, null, ((MediaStore.Audio.Media.TITLE) + " ASC"));
}