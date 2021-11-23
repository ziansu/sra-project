private void notifyChange(java.lang.String what) {
    android.content.Intent i = new android.content.Intent(what);
    i.putExtra("album", getAlbumName());
    i.putExtra("track", getTrackName());
    sendBroadcast(i);
}