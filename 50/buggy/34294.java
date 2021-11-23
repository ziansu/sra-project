public Card removeCard() {
    if (!(cardList.empty())) {
        return cardList.pop();
    }else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}