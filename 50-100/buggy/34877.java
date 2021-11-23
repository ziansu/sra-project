@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((!(MyMediaBound)) && ((MyMediaService) == null)) {
        android.content.Intent intent = new android.content.Intent(this, com.softwarebysteve.spotify_stream_p2.MyMediaService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
        android.util.Log.v(LOGTAG, "Starting to bind to service");
    }
}