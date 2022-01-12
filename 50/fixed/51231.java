public boolean bombChecker(java.util.ArrayList<scum.Card> cardsList) {
    if ((cardsList.size()) < 4)
        return false;
    
    return areCardsAllSameNumber(new java.util.ArrayList<scum.Card>(cardsList.subList(0, 4)));
}