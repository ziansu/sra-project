KT(java.lang.String dato, java.lang.String tidspunkt, int varighet, int personligForm, int prestasjon, java.lang.String notat) {
    return ((application.Tabell.INSERT.TODO) + "Trenings�kt ") + (application.Tabell.values(dato, tidspunkt, application.Tabell.valueOf(varighet), application.Tabell.valueOf(personligForm), application.Tabell.valueOf(prestasjon), application.Tabell.valueOf(notat)));
}