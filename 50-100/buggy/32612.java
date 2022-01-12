private void start_game() {
    Card.initialise_hand(Dealer.hand);
    for (int i = 0; i < 2; i++) {
        Dealer.hand[i] = Dealer.draw_card();
        (Dealer.cards_in_hand)++;
    }
    while (!(Dealer.game_finished)) {
        serve_players();
    } 
    Dealer.start_game = Definitions.NO;
}