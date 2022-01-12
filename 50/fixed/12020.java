private boolean playPairSum11IfPossible() {
    java.util.List<java.lang.Integer> pair = findPairSum11(cardIndexes());
    if ((pair.size()) == 2) {
        replaceSelectedCards(pair);
        return true;
    }else
        return false;
    
}