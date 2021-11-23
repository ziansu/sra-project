public java.lang.Boolean inSportelloOAttribuzioneR() {
    java.util.List intersezione = new java.util.ArrayList(attribuzioni);
    intersezione.retainAll(ufficiUtente);
    return (ufficiRiservatoUtente.contains(sportello)) || ((intersezione.size()) > 0);
}