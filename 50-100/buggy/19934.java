public void AddCard(int value) {
    if (value == 1) {
        (aceCount)++;
        this.aceTotal = (this.total) + 11;
        cardValues[cardNumber] = value;
        this.total += value;
        (this.cardNumber)++;
    }else {
        cardValues[cardNumber] = value;
        (this.cardNumber)++;
        this.total += value;
    }
}