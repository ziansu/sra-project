public ninja.Result newRound(controllers.Blackjack blackjack) {
    blackjack.newRound();
    return ninja.Results.json().render(blackjack);
}