@org.springframework.web.bind.annotation.RequestMapping(value = "/playlist")
public spotlight.Playlist playlist() {
    spotlight.Song song = new spotlight.Song(songCounter.incrementAndGet(), "Wolf", "Sylvan Esso", 5);
    java.util.ArrayList<spotlight.Song> songList = new java.util.ArrayList<>();
    songList.add(song);
    return new spotlight.Playlist(counter.incrementAndGet(), song, songList);
}