public ninja.Result gameGet(@ninja.params.PathParam(value = "choice")
int choose) {
    models.Game g = new models.amGame();
    models.Game g2 = new models.spGame();
    if (choose == 1) {
        g.buildDeck();
        g.shuffle();
        return ninja.Results.json().render(g);
    }else {
        g2.buildDeck();
        g2.shuffle();
        return ninja.Results.json().render(g2);
    }
}