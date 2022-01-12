public static void spielerVerloren(java.lang.String name) {
    for (monopoly.spieler.Spieler s : monopoly.map.MonopolyMap.spieler) {
        if (s.getSpielfigur().equals(name)) {
            monopoly.bank.Bank.einzahlen(s.getKontostand());
            java.lang.System.out.println(((s.getSpielfigur()) + " ist Pleite und wird aus der Liste der Speielr entfernt"));
            monopoly.map.MonopolyMap.spieler.remove(s);
            monopoly.map.MonopolyMap.anzahlSpieler = (monopoly.map.MonopolyMap.anzahlSpieler) - 1;
            break;
        }
    }
}