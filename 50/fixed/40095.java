public ninja.Result dealerHit(ninja.Context context, models.Blackjack g) {
    g.dealerHit();
    return ninja.Results.json().render(g);
}