@java.lang.Override
public java.util.List<java.lang.Integer> getYears() {
    java.util.List<java.lang.Integer> pomStrings = new java.util.ArrayList<>();
    for (com.mycompany.audiolibrary.Song songs : this.songs) {
        if (!(pomStrings.contains(songs.getYear())))
            pomStrings.add(songs.getYear());
        
    }
    return pomStrings;
}