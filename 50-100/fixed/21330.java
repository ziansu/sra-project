public void anlegenProjekt(java.lang.String name, java.lang.String beschreibung, int tag, int monat, int jahr) {
    java.lang.System.out.println(name);
    java.lang.System.out.println(beschreibung);
    java.util.GregorianCalendar greg = new java.util.GregorianCalendar(jahr, monat, tag);
    swt_projektplaner.Projekt projekt = new swt_projektplaner.Projekt(name, beschreibung, greg);
    java.lang.System.out.println(greg);
    try {
        datenbank.speicherProjekt(projekt);
    } catch (java.lang.Exception e) {
        java.lang.System.err.print(("Fehler beim Einspeichern: " + (e.getMessage())));
    }
}