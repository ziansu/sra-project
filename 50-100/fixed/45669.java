private void displaySongInfo() {
    android.widget.TextView songTitleTextView;
    android.widget.TextView songArtistTextView;
    songTitleTextView = ((android.widget.TextView) (mContentView.findViewById(R.id.song_title)));
    songArtistTextView = ((android.widget.TextView) (mContentView.findViewById(R.id.song_artist)));
    if ((songTitleTextView == null) || (songArtistTextView == null))
        return ;
    
    songTitleTextView.setText(mTitle);
    songArtistTextView.setText(mArtist);
}