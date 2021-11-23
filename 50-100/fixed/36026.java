@java.lang.Override
public java.util.List<java.lang.String> getGenres() {
    java.util.List<java.lang.String> pomStrings = new java.util.ArrayList<>();
    for (com.mycompany.audiolibrary.Song songs : this.songs) {
        if (!(pomStrings.contains(songs.getGenre())))
            pomStrings.add(songs.getGenre());
        
    }
    return pomStrings;
}