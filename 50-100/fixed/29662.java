private void layoutMusicLyrics() {
    java.lang.String[] musicLyricsArray = getResources().getStringArray(lyricsId);
    java.lang.String musicLyrics = musicLyricsArray[musicPosition];
    if (isEmpty(musicLyrics)) {
        return ;
    }
    android.widget.TextView lyricsTextView = ((android.widget.TextView) (findViewById(R.id.playMusicActivity_lyricsTextView)));
    lyricsTextView.setText(musicLyrics);
}