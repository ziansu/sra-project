public void enqueue(com.example.brianchan.ripple_android.Song song) {
    if ((songs) == null) {
        songs = new java.util.LinkedList<com.example.brianchan.ripple_android.Song>();
    }
    songs.add(song);
}