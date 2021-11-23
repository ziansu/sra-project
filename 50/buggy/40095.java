public ninja.Result dealerHit(ninja.Context context, models.Blackjack g) {
    g.dPlay();
    return ninja.Results.json().render(g);
}