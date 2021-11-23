public ninja.Result dealerAction(controllers.Blackjack blackjack) {
    blackjack.dealerAction();
    return ninja.Results.json().render(blackjack);
}