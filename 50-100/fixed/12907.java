public int getValue(gameplay.Card card) {
    int s = card.getSuit();
    int val;
    switch (s) {
        case 0 :
            val = this.spades.indexOf(card);
            break;
        case 1 :
            val = this.hearts.indexOf(card);
            break;
        case 2 :
            val = this.clubs.indexOf(card);
            break;
        case 3 :
            val = this.diamonds.indexOf(card);
            break;
        default :
            val = 0;
    }
    return val;
}