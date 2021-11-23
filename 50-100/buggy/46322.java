public int total() {
    this.replacePowerCards();
    int total = this.cards[0].getNumber();
    total += this.cards[1].getNumber();
    total += this.cards[2].getNumber();
    total += this.cards[3].getNumber();
    return total;
}