public boolean NewGame(BlackJack.model.Deck a_deck, BlackJack.model.Dealer a_dealer, BlackJack.model.Player a_player) {
    doRound(a_deck, a_player, true);
    doRound(a_deck, a_player, true);
    doRound(a_deck, a_player, true);
    doRound(a_deck, a_player, false);
    return true;
}