private void parseZeile(int zeilennummer) {
    java.lang.String zeile = zeilen.get(zeilennummer);
    if (zeile.startsWith("?")) {
        wechsleAufgabe();
        aktuelleAufgabe.setFrage(fragezeichenAnsEndeSetzen(zeile));
    }else
        if (zeile.startsWith("*")) {
            aktuelleAufgabe.setRichtigeAntwort(zeile);
            aktuelleAufgabe.ergaenzeAntwortmoeglichkeit(zeile.substring(1));
        }else {
            aktuelleAufgabe.ergaenzeAntwortmoeglichkeit(zeile);
        }
    
}