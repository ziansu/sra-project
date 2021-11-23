public ninja.Result newRound(controllers.Blackjack blackjack) {
    if ((blackjack.playerBalance) < 2) {
        blackjack.errorState = true;
    }
    return ninja.Results.json().render(blackjack);
}