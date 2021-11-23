public java.lang.String getFullArtist() {
    if ((fullartist) == null) {
        fullartist = ((subartist.length()) > 0) ? ((artist) + " ") + (subartist) : artist;
    }
    return fullartist;
}