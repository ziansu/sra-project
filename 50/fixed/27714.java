public java.lang.Class<? extends me.redraskal.arcadia.api.game.BaseGame> nextGame() {
    (current)++;
    if ((current) >= (games.size()))
        current = 0;
    
    return this.getCurrentGame();
}