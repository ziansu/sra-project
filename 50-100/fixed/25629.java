@java.lang.Override
public java.lang.Boolean addSong(java.lang.String name, java.lang.Integer duration) {
    boolean result = false;
    if (((name != null) && (!(name.equals("")))) && (duration != null)) {
        ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Song song = new ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Song(name, duration);
        this.currentSession.save(song);
        result = true;
    }else {
        throw new java.lang.IllegalArgumentException("the parameters for creating a song can not all be empty or null");
    }
    return result;
}