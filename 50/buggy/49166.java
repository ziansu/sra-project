public boolean canPlaceSoldier() {
    if (((oldDevCards.getSoldier()) != 0) || ((newDevCards.getSoldier()) != 0)) {
        return true;
    }
    return false;
}