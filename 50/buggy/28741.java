public GameImplementation.Card drawTopCard() {
    if ((this.getCurrentSize()) != 0) {
        return cards.pop();
    }else {
        return null;
    }
}