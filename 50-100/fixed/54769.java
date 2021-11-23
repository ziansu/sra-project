private boolean checkForPairs() {
    if (((findPairs(4)) == 0) && ((kindCounter) == 2)) {
        java.lang.System.out.println("Two Pairs!");
        kindCounter = 0;
        return true;
    }
    kindCounter = 0;
    if (((findRoyalPair(4)) == 0) && ((kindCounter) == 1)) {
        java.lang.System.out.println("Royal Pair!");
        kindCounter = 0;
        return true;
    }
    kindCounter = 0;
    return false;
}