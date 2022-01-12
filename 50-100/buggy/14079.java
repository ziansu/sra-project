public java.lang.String toString() {
    java.lang.String r = "";
    int track = 1;
    for (Song s : this.songs) {
        r += (("\tTrack: " + track) + " ") + (s.toString());
        if (track < ((this.songs.size()) - 1))
            r += "\n";
        
        track++;
    }
    return r;
}