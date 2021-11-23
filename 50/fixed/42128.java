public java.lang.Class<? extends me.redraskal.arcadia.api.game.BaseGame> nextGame() {
    if ((current) >= (games.size()))
        current = -1;
    
    (current)++;
    return this.getCurrentGame();
}