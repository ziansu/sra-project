@java.lang.Override
public void onBindViewHolder(com.rwpham.spotifyexample.SongAdapter.ViewHolder viewHolder, int position) {
    java.lang.String artist = songList.get(position).artists.get(0).name;
    java.lang.String title = songList.get(position).name;
    java.lang.System.out.printf("onbindviewholder: artist: %s title: %s \n", artist, title);
    android.widget.TextView artistTextView = viewHolder.artist;
    artistTextView.setText(artist);
    android.widget.TextView titleTextView = viewHolder.artist;
    titleTextView.setText(title);
}