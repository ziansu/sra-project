public void uscita(int s, double time) {
    java.lang.System.out.println(((("è uscito " + s) + " a ") + time));
    (numPacchetti)++;
    tempiRisposta += time - (arrivi.get(s));
    arrivi.remove(s);
    tempoOccupazione += time - (uscitaCoda.get(s));
}