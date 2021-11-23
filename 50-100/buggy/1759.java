protected void onPostExecute(com.uwo.crystalli.jukebox.VideoResult video) {
    android.util.Log.v(LOG_TAG, "GetNextMediaTask finished");
    if (video != null) {
        mYoutubePlayer.cueVideo(video.getId());
        android.util.Log.v(LOG_TAG, "play()");
        mYoutubePlayer.play();
    }else {
        java.lang.String toastMessage = "There's nothing in the queue!";
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}