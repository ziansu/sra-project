private int werteTrumpf(int gewinner, int valueSp1, int valueSp2) {
    if ((valueSp1 > 50) || (valueSp2 > 50)) {
        if (valueSp1 > valueSp2) {
            gewinner = de.verbund.watten.regelwerk.Regelwerk.SPIELER_1;
        }
        if (valueSp2 > valueSp2) {
            gewinner = de.verbund.watten.regelwerk.Regelwerk.SPIELER_2;
        }
    }
    return gewinner;
}