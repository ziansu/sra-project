private boolean checkForAKind() {
    if (((findSameRank(((PJ5.SimplePoker.numberOfCards) - 1))) < 0) && ((kindCounter) == 4)) {
        java.lang.System.out.println("Four of a kind!");
        kindCounter = 0;
        return true;
    }else
        if (((findSameRank(((PJ5.SimplePoker.numberOfCards) - 1))) < 0) && ((kindCounter) == 3)) {
            java.lang.System.out.println("Three of a kind!");
            kindCounter = 0;
            return true;
        }
    
    return false;
}