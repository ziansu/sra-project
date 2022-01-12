public int getValue(gameplay.Card card) {
    int s = card.getSuit();
    int val;
    switch (s) {
        case 0 :
            val = this.indexOf(spades, card);
            break;
        case 1 :
            val = this.indexOf(hearts, card);
            break;
        case 2 :
            val = this.indexOf(clubs, card);
            break;
        case 3 :
            val = this.indexOf(diamonds, card);
            break;
        default :
            val = 0;
    }
    return val;
}