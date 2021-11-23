protected static void play_hand() {
    int hand_value = Card.hand_value(Dealer.hand);
    while ((hand_value < 17) && ((Dealer.cards_in_hand) != 5)) {
        Dealer.hand[Dealer.cards_in_hand] = Dealer.draw_card();
        (Dealer.cards_in_hand)++;
        hand_value = Card.hand_value(Dealer.hand);
    } 
    return ;
}