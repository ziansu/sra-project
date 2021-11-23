private static boolean rauswerfen(int neuesFeld, int spielerNummer) {
    for (int rspielerNummer : si.projekt.maedn.Spiel.spieler.keySet()) {
        if (rspielerNummer != spielerNummer) {
            si.projekt.maedn.Spieler rspieler = si.projekt.maedn.Spiel.spieler.get(rspielerNummer);
            for (int spielFigurNummer : rspieler.holeSpielfiguren().keySet()) {
                si.projekt.maedn.Spielfigur spielFigur = rspieler.holeSpielfiguren().get(spielFigurNummer);
                if ((spielFigur.feldnummer) == neuesFeld) {
                    spielFigur.rauswerfen();
                    return true;
                }
            }
        }
    }
    return false;
}