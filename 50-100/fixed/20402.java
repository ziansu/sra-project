public boolean equals(ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Artist art) {
    if (art == null)
        throw new java.lang.IllegalArgumentException("Artist can't be null");
    
    if (((this.name.equals(art.name)) && (this.nickname.equals(art.nickname))) && (this.surname.equals(art.surname))) {
        return true;
    }
    return false;
}