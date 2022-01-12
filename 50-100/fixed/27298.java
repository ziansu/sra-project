private void tryPlayNextSong() {
    if ((player.getPlayedSong()) >= (repeatTime)) {
        java.lang.String line = mine.android.HeavenClock.MainActivity.getContext().getString(R.string.no_more_song);
        line = line.replaceFirst("\\{n\\}", java.lang.String.valueOf(repeatTime));
        android.widget.Toast.makeText(mine.android.HeavenClock.MainActivity.getContext(), line, Toast.LENGTH_LONG).show();
        return ;
    }
    player.skipCurrentSong();
}