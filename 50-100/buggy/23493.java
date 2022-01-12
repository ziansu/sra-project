private static boolean isValueValid(java.lang.String wert) {
    assert wert != null : "Vorbedingung verletzt: wert != null";
    if ((((de.uni_hamburg.informatik.swt.se2.kino.fachwerte.Geldbetrag.containsInvalidSymbols(wert)) || (de.uni_hamburg.informatik.swt.se2.kino.fachwerte.Geldbetrag.containsMultipleCommas(wert))) || (de.uni_hamburg.informatik.swt.se2.kino.fachwerte.Geldbetrag.containsInvalidCentValues(wert))) || (de.uni_hamburg.informatik.swt.se2.kino.fachwerte.Geldbetrag.containsTooManyNumbers(wert))) {
        return false;
    }
    return true;
}