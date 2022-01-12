public void setEpisodesWatched(int episodes_watched_value) {
    if ((episodes_watched) == null)
        episodes_watched = ((android.widget.TextView) (findViewById(R.id.episodes_watched)));
    
    episodes_watched.setText(java.lang.Integer.toString(episodes_watched_value));
}