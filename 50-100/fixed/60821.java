public void uscita(int s, double time) {
    (numPacchetti)++;
    tempiRisposta += time - (arrivi.get(s));
    arrivi.remove(s);
    tempoOccupazione += time - (uscitaCoda.get(s));
}