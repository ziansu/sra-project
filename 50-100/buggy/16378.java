public int getPocketCount() {
    int total = 0;
    for (Card card : pocket) {
        if ((card.getFace()) != "Ace") {
            total += card.getFaceValue();
        }
    }
    for (Card card : pocket) {
        if ((card.getFace()) == "Ace") {
            if ((total + (card.getFaceValue())) >= 21) {
                total += 1;
            }else {
                total += 11;
            }
        }
    }
    return total;
}