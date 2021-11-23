public void bearbeiteDeadline(swt_projektplaner.Projekt p, int tag, int monat, int jahr) {
    java.util.GregorianCalendar greg = new java.util.GregorianCalendar(jahr, monat, tag);
    p.setDeadline(greg);
    try {
        datenbank.bearbeiteProjektDeadline(p, greg);
    } catch (java.lang.Exception e) {
        java.lang.System.err.print(("Fehler beim Einspeichern: " + (e.getMessage())));
    }
}