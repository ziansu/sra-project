public void init() {
    smallBlind = new Backend.Blind(smallBlindValue);
    bigBlind = new Backend.Blind(smallBlindValue);
    this.initSeats();
}