public Card removeCard() {
    if (!(cardList.isEmpty())) {
        return cardList.remove(((cardList.size()) - 1));
    }else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}