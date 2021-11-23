public void onClick(android.view.View v) {
    try {
        if ((mediaPlayer) == null)
            throw new java.lang.Exception("No file loaded!");
        
        mediaPlayer.seekTo(mediaPlayer.getDuration());
    } catch (java.lang.Exception e) {
        android.support.design.widget.Snackbar.make(v, e.toString(), Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}