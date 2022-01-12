@java.lang.Override
public java.util.List<java.lang.String> getYears() {
    java.util.List<java.lang.String> pomStrings = new java.util.ArrayList<>();
    for (com.mycompany.audiolibrary.Song songs : this.songs) {
        if (!(pomStrings.contains(java.lang.String.valueOf(songs.getYear()))))
            pomStrings.add(songs.getInterpret());
        
    }
    return pomStrings;
}