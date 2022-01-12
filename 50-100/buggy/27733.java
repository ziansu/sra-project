public int getSum() {
    for (com.freshpeople.training.blackjack.Card c : myCardList) {
        if (c.getStringNumber().equals("A")) {
            if ((sum) >= 21) {
                sum += 1;
            }else {
                sum += 11;
            }
        }else {
            sum += ((c.getIntNumber()) > 10) ? 10 : c.getIntNumber();
        }
    }
    return sum;
}