private boolean hasFullHouse(com.benlink.kismet.model.KismetDie die1, com.benlink.kismet.model.KismetDie die2, com.benlink.kismet.model.KismetDie die3, com.benlink.kismet.model.KismetDie die4, com.benlink.kismet.model.KismetDie die5) {
    if (((ofAKind(die1, die2, die3, die4, die5)) == 3) && ((countPairs(die1, die2, die3, die4, die5)) > 1)) {
        return true;
    }
    return false;
}