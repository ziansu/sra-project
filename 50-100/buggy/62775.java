public void onClick(android.view.View v) {
    try {
        if ((mediaPlayer) == null)
            throw new java.lang.Exception("No file loaded!");
        
        mediaPlayer.seekTo(mediaPlayer.getDuration());
        android.support.design.widget.Snackbar.make(v, "Reached end", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    } catch (java.lang.Exception e) {
        android.support.design.widget.Snackbar.make(v, e.toString(), Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}