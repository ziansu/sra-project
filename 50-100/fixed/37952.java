public static void main(java.lang.String[] args) {
    classes.iBediener ib = new classes.Spiel();
    ib.spielerHinzufuegen("Rasanter Rudi", 1, 1);
    ib.spielerHinzufuegen("Fliegerbernd", 0, 1);
    ib.beginneSpiel();
    GUI.Aufgabe_b GUI = new GUI.Aufgabe_b();
    GUI.setBediener(ib);
    GUI.rahmen();
}