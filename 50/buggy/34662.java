public ninja.Result dealerAction(controllers.Blackjack blackjack) {
    return ninja.Results.json().render(blackjack);
}