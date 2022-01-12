private int findJohnStamosBottom(int index) {
    int cardBottom = currentHand.get(0).getRank();
    if (index < 0) {
        return index;
    }
    if (cardBottom == (currentHand.get(index).getRank())) {
        kindCounter += 1;
        return findJohnStamosTop((index - 1));
    }else
        if (cardBottom != (currentHand.get(index).getRank())) {
            return findJohnStamosTop((index - 1));
        }
    
    return index;
}