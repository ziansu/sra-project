public void spielerHinzufuegen(classes.Spieler spieler) {
    if (!(spielHatBegonnen)) {
        if (spieler == null)
            throw new java.lang.RuntimeException("Spieler existiert nicht!");
        
        for (int i = 0; i < (this.spieler.size()); i++) {
            if ((this.spieler.get(i).getFarbe()) == (spieler.getFarbe()))
                throw new java.lang.RuntimeException("Der Spieler mit dieser Farbe nimmt bereits am Spiel teil!");
            
            this.spieler.add(spieler);
        }
    }
}