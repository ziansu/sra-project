public boolean equals(ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Artist art) {
    if (art == null)
        throw new java.lang.IllegalArgumentException("Artist can't be null");
    
    if ((((this.name) == (art.name)) && ((this.nickname) == (art.nickname))) && ((this.surname) == (art.surname))) {
        return true;
    }
    return false;
}