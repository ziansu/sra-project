public data.Karte getHighestCard(final java.awt.Color farbe) {
    data.Karte highestCard = karten.get(0);
    for (data.Karte k : karten) {
        if ((k.getFarbe().equals(farbe)) && ((k.getNummer()) > 11)) {
            if (highestCard == null) {
                highestCard = k;
            }else
                if ((highestCard.getNummer()) < (k.getNummer())) {
                    highestCard = k;
                }
            
        }
    }
    return highestCard;
}