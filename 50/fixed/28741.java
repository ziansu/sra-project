public GameImplementation.Card drawTopCard() {
    if (!(this.isEmpty())) {
        return cards.pop();
    }else {
        return null;
    }
}