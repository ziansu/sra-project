public int addAnfrage(Terminkalender.Termin termin, java.lang.String text, java.lang.String absender) {
    meldungen.add(new Terminkalender.Anfrage(text, termin, absender, meldungsCounter));
    (meldungsCounter)++;
    return (meldungsCounter) - 1;
}